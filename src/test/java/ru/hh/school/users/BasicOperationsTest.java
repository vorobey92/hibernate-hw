package ru.hh.school.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.*;
import ru.hh.school.BaseTest;
import ru.hh.school.TestHelper;
import ru.hh.school.TransactionRule;

public class BasicOperationsTest extends BaseTest {

  /**
   * Оборачивает каждый @Test в транзакцию
   */
  @Rule
  public TransactionRule transactionRule = new TransactionRule(sessionFactory);

  @BeforeClass
  public static void setupTables() {
    TestHelper.executeScript(pg.getPostgresDatabase(), "create_users.sql");
  }

  @Before
  public void cleanTestData() {
    TestHelper.execute(pg.getPostgresDatabase(), "delete from users");
  }

  @Test
  public void saveNewUserShouldInsertDbRow() {
    User user = new User("John", "Lennon");
    getSession().persist(user);

    assertEquals(1L, getInsertCount());
    assertEquals(user, getSession().get(User.class, user.getId()));
  }

  @Test
  public void deleteUserShouldDeleteDbRow() {
    User user = new User("John", "Lennon");
    getSession().persist(user);

    User extractedUser = getSession().get(User.class, user.getId());
    assertNotNull(extractedUser);

    getSession().delete(extractedUser);

    extractedUser = getSession().get(User.class, user.getId());
    assertNull(extractedUser);
  }

  @Test
  public void getByIdShouldReturnUserFromCache() {
    User user = new User("John", "Lennon");
    getSession().persist(user);
    user.setFirstName("CHANGED_NAME");

    User extractedUser = getSession().get(User.class, user.getId());

    assertEquals(0L, getUpdateCount());
    assertEquals(0L, getSelectCount());
    assertNotNull(extractedUser);
    assertEquals(user, extractedUser);
  }

  @Test
  public void getWithQueryShouldReturnUserIfRowExists() {
    User user = new User("John", "Lennon");
    getSession().persist(user);

    user.setFirstName("CHANGED_NAME");

    User extractedUser = getSession().createQuery("from User where id = :userId", User.class)
      .setParameter("userId", user.getId())
      .getSingleResult();

    assertEquals(1L, getUpdateCount());
    assertEquals(1L, getSelectCount());

    assertNotNull(extractedUser);
    assertEquals(user, extractedUser);
  }
}
