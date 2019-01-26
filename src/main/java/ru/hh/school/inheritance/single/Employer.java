package ru.hh.school.inheritance.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "EmployerSingle")
@DiscriminatorValue("Employer")
public class Employer extends User {

  private String company;

  public Employer() {
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " from " + company;
  }
}
