package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

  @Ignore
  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = doInTransaction(() ->
      // ToDo дополните запрос, чтобы возвращался ru.hh.school.employers.StatisticsDto
      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
      getSession().createQuery(
        "select count(e.id), sum(e.bonusPoints) from Employer e", StatisticsDto.class)
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
