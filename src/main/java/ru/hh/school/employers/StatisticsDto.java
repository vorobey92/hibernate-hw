package ru.hh.school.employers;

/**
 * DTO - Data transfer object
 * https://martinfowler.com/eaaCatalog/dataTransferObject.html
 *
 */
public class StatisticsDto {

  private final static String REPORT_TEMPLATE = "total employers=%d, total bonuses=%d";

  private final long employerCount;
  private final long totalBonuses;

  StatisticsDto() {
    employerCount = 0;
    totalBonuses = 0;
  };

  public StatisticsDto(long employerCount, long totalBonuses) {
    this.employerCount = employerCount;
    this.totalBonuses = totalBonuses;
  }

  public String summaryReport() {
    return String.format(REPORT_TEMPLATE, employerCount, totalBonuses);
  }

  @Override
  public String toString() {
    return summaryReport();
  }
}
