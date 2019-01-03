package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import ru.hh.school.TransactionRule;

public class NPlusOneTest extends EmployerTest {

  @Rule
  public TransactionRule transactionRule = new TransactionRule(sessionFactory);

  @Test
  public void shouldExecuteOneStatement() {
    //  e.vacancies
    String query = "select count(v) from Employer e inner join e.vacancies as v group by e";
    Long[] actualSizes = getSession().createQuery(query, Long.class).list().toArray(Long[]::new);

    // Удостоверимся, что наш измененный запрос вернул то, что нужно
    Arrays.sort(actualSizes);
    Long[] requiredSizes = new Long[]{1L, 1L, 1L, 3L};
    assertEquals(requiredSizes, actualSizes);

    assertEquals(1L, getSelectCount());
  }

}
