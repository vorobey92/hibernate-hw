package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.junit.Rule;
import org.junit.Test;
import ru.hh.school.TransactionRule;

import java.util.List;

public class NPlusOneTest extends EmployerTest {

  @Rule
  public TransactionRule transactionRule = new TransactionRule(sessionFactory);

  /**
   * ToDo Попробуйте модифицировать запрос так, чтобы выполнился 1 запрос
   *
   */
  @Test
  public void shouldExecuteOneStatement() {
    List<Employer> employers = getSession().createQuery("from Employer employer join fetch employer.vacancies Vacancy")
      .list();

    employers.forEach((emp) -> emp.getVacancies().size());

    assertEquals(1L, getSelectCount());
  }

}
