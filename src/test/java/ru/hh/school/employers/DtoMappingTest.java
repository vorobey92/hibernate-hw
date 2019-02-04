package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

  @Test
  public void mapQueryResultToDto() {
    StatisticsDto dto = doInTransaction(() ->

      // https://vladmihalcea.com/the-best-way-to-map-a-projection-query-to-a-dto-with-jpa-and-hibernate/
            // Use a Constructor Expression by specifying the NEW keyword along with the fully-qualified
            // name of the class representing the DTO projection and the list of attributes
            // that will be passed as constructor arguments.
      getSession().createQuery(
        "select new ru.hh.school.employers.StatisticsDto(count(e.id), sum(e.bonusPoints)) from Employer e",
              StatisticsDto.class)
        .getSingleResult()
    );

    assertEquals(1L, getSelectCount());
    assertNotNull(dto);
  }
}
