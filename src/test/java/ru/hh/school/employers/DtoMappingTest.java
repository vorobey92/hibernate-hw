package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.hibernate.transform.Transformers;
import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = (StatisticsDto)doInTransaction(() ->
      // ToDo дополните запрос, чтобы возвращался ru.hh.school.employers.StatisticsDto
      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
      getSession().createQuery(
        "select count(e.id) as employerCount, sum(e.bonusPoints) as totalBonuses from Employer e")
        .unwrap(org.hibernate.query.Query.class)
        .setResultTransformer(Transformers.aliasToBean(StatisticsDto.class))
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
