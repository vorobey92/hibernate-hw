package ru.hh.school.inheritance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import ru.hh.school.BaseTest;
import ru.hh.school.TestHelper;
import ru.hh.school.TransactionRule;
import ru.hh.school.inheritance.table.Applicant;
import ru.hh.school.inheritance.table.Employer;
import ru.hh.school.inheritance.table.User;
import java.util.Set;
import java.util.stream.Collectors;

public class TableStrategyTest extends BaseTest {

  @Rule
  public TransactionRule transactionRule = new TransactionRule(sessionFactory);

  @BeforeClass
  public static void createTable() {
    TestHelper.executeScript(pg.getPostgresDatabase(), "create_user_inheritance_table.sql");
  }

  @Before
  public void clearTable() {
    TestHelper.execute(pg.getPostgresDatabase(), "delete from user_inheritance_table");
    TestHelper.execute(pg.getPostgresDatabase(), "delete from employer_inheritance_table");
    TestHelper.execute(pg.getPostgresDatabase(), "delete from applicant_inheritance_table");
  }

  /**
   * ToDo создайте нужные таблицы в файле scripts/create_user_inheritance_table.sql
   *
   * https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html#entity-inheritance-table-per-class
   */
  @Test
  public void saveDifferentTypes() {
    User user = new User();
    user.setName("John Doe");
    getSession().persist(user);

    Employer employer = new Employer();
    employer.setName("John Employer");
    employer.setCompany("HH");
    getSession().persist(employer);

    Applicant applicant = new Applicant();
    applicant.setName("John Applicant");
    applicant.setPosition("Director");
    getSession().persist(applicant);

    getSession().flush();

    // обратите внимание, что в данном случае выполняется по 1 insert-у
    assertEquals(3L, getInsertCount());
  }

  @Test
  public void polymorphicCallsShouldWork() {
    saveDifferentTypes();
    clearQueriesCounts();

    Set<String> userGreetings = getSession().createQuery("from UserTable", User.class).stream()
      .map(User::generateGreeting)
      .collect(Collectors.toSet());

    // обратите внимание на сгенирированный хибернейтом запрос (импользуются union all-ы)
    assertEquals(1L, getSelectCount());
    assertTrue(userGreetings.contains("Hello, John Doe"));
    assertTrue(userGreetings.contains("Hello, John Employer from HH"));
    assertTrue(userGreetings.contains("Hello, John Applicant the Director"));
  }

}
