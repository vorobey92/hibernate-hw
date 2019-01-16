package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.List;

public class AvoidLazyExceptionTest extends EmployerTest {

  /**
   * Todo Переделайте код теста, чтобы избежать org.hibernate.LazyInitializationException
   *
   * https://vladmihalcea.com/the-best-way-to-handle-the-lazyinitializationexception/
   */
  @Test
  public void shouldAvoidLazyException() {
    List<Employer> employers = doInTransaction(
      () -> getSession().createQuery("from Employer emp join fetch emp.vacancies", Employer.class).list()
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
