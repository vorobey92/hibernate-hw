package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.List;

public class AvoidLazyExceptionTest extends EmployerTest {

  private static final String QUERY_EMPLOYERS = "from Employer as emp left join fetch emp.vacancies";

  /**
   * Todo Переделайте код теста, чтобы избежать org.hibernate.LazyInitializationException
   *
   * https://vladmihalcea.com/the-best-way-to-handle-the-lazyinitializationexception/
   */
  @Test
  public void shouldAvoidLazyException() {
    List<Employer> employers = doInTransaction(
      () -> getSession().createQuery(QUERY_EMPLOYERS, Employer.class).list()
    );
    assertEquals(1L, getSelectCount());

    // сейчас Employer-ы в detached состоянии, т.к. сессия закрылась
    int totalVacancies = employers.stream()
      .map(Employer::getVacancies)
      .mapToInt(List::size)
      .sum();

    assertTrue(totalVacancies > 0);
  }

}
