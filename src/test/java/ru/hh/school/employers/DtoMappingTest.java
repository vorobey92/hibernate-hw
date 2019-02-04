package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

  private static final String STATS =
          "select new ru.hh.school.employers.StatisticsDto(count(e.id), sum(e.bonusPoints)) from Employer e";

  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = doInTransaction(() ->
      // ToDo дополните запрос, чтобы возвращался ru.hh.school.employers.StatisticsDto
      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
      getSession().createQuery(STATS, StatisticsDto.class)
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
