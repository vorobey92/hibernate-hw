package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = doInTransaction(() ->
      // ToDo дополните запрос, чтобы возвращался ru.hh.school.employers.StatisticsDto
      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
      getSession().createQuery(
        "SELECT new ru.hh.school.employers.StatisticsDto(count(e.id), sum(e.bonusPoints)) FROM Employer e", StatisticsDto.class)
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
