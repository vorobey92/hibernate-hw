package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.junit.Test;

import java.util.function.Supplier;

public class DtoMappingTest extends EmployerTest {

  private static final String QUERY_STATISTICS =
        "select new ru.hh.school.employers.StatisticsDto(count(e.id), sum(e.bonusPoints)) from Employer e";
        // employerCount и employerCount объявлены final, поэтому ResultTransformer не годится

  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = doInTransaction(() ->
      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
      getSession().createQuery( QUERY_STATISTICS, StatisticsDto.class)
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
