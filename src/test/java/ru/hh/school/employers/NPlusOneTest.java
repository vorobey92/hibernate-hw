package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;

import ru.hh.school.TransactionRule;

public class NPlusOneTest extends EmployerTest {

  @Rule
  public TransactionRule transactionRule = new TransactionRule(sessionFactory);

  @Test
  public void shouldExecuteOneStatement() {
    //  e.vacancies
    String query = "from Employer e join fetch e.vacancies";
    int[] actualSizes = getSession().createQuery(query, Employer.class).stream()
      .map(Employer::getVacancies).mapToInt(List::size).toArray();

    // Удостоверимся, что наш измененный запрос вернул то, что нужно
    Arrays.sort(actualSizes);
    int[] requiredSizes = new int[]{1, 1, 1, 3};
    assertTrue(Arrays.equals(actualSizes, requiredSizes));

    assertEquals(1L, getSelectCount());
  }

}
