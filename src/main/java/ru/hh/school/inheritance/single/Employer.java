package ru.hh.school.inheritance.single;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "EmployerSingle")
public class Employer extends User {

  @Column(name = "company")
  private String company;

  public void setCompany(String company) {
    this.company = company;
  }

  public String getCompany() {
    return company;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " from " + company;
  }
}
