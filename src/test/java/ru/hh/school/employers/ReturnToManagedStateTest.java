package ru.hh.school.employers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.Test;
import java.util.List;

public class ReturnToManagedStateTest extends EmployerTest {

  @Test
  public void shouldSaveNewStateOfEmployerToDb() {
    List<Employer> employers = doInTransaction(
      () -> getSession().createQuery("from Employer", Employer.class).list()
    );
    assertEquals(1L, getSelectCount());

    // сейчас Employer-ы в detached состоянии, т.к. сессия закрылась.
    // А состояние employer-ам мы меняем внутри метода calculateBonusPoints()
    //
    // про состояния: https://vladmihalcea.com/a-beginners-guide-to-jpa-hibernate-entity-state-transitions/
    // про возврат в managed состояние: https://vladmihalcea.com/jpa-persist-and-merge (часть про merge)
    employers.forEach(Employer::calculateBonusPoints);

    // ToDo: тут надо написать код для синхронизации с бд
    doInTransaction(() -> employers.forEach(x -> getSession().merge(x)));

    assertTrue(getAllBonusPointsFromDb() > 0);
  }

  private Long getAllBonusPointsFromDb() {
    return doInTransaction(
      () -> getSession().createQuery("select sum(bonusPoints) from Employer", Long.class).uniqueResult()
    );
  }

}
