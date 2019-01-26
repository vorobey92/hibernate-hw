package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import java.util.List;

public class ReturnToManagedStateTest extends EmployerTest {

  @Test
  public void shouldSaveNewStateOfEmployerToDb() {
    List<Employer> employers = doInTransaction(
      () -> getSession().createQuery("from Employer", Employer.class).list()
    );
    assertEquals(1L, getSelectCount());

    employers.forEach(Employer::calculateBonusPoints);

    doInTransaction( () -> {
      employers.forEach( (emp) -> {
        getSession().merge(emp);
      });
    });

    assertTrue(getAllBonusPointsFromDb() > 0);
  }

  private Long getAllBonusPointsFromDb() {
    return doInTransaction(
      () -> getSession().createQuery("select sum(bonusPoints) from Employer", Long.class).uniqueResult()
    );
  }

}
