package ru.hh.school.employers;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html#embeddables
@Embeddable
public class Salary {

  @Column(name = "salary_amount")
  private Integer amount;

  // лучше использовать enum
  @Column(name = "salary_currency")
  private String currency;

}
