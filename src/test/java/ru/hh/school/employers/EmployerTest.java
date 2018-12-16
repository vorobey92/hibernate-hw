package ru.hh.school.employers;

import org.junit.Before;
import org.junit.BeforeClass;
import ru.hh.school.BaseTest;
import ru.hh.school.TestHelper;

public abstract class EmployerTest extends BaseTest {

  @BeforeClass
  public static void setupTables() {
    TestHelper.executeScript(pg.getPostgresDatabase(), "create_employers.sql");
  }

  @Before
  public void populateTestData() {
    TestHelper.execute(pg.getPostgresDatabase(), "delete from vacancy");
    TestHelper.execute(pg.getPostgresDatabase(), "delete from employer");
    TestHelper.executeScript(pg.getPostgresDatabase(), "insert_employers.sql");
  }
}
