package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DtoMappingTest extends EmployerTest {

    @Test
    public void mapQueryResultToDto() {
        StatisticsDto dto = doInTransaction(() ->
                getSession().createQuery("select new ru.hh.school.employers.StatisticsDto(count(e.id), sum(e.bonusPoints)) from Employer e", StatisticsDto.class)
                        .getSingleResult()
        );

        assertEquals(1L, getSelectCount());
        assertNotNull(dto);
    }
}
