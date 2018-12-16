package ru.hh.school.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "EmployerJoined")
@Table(name = "employer_inheritance_joined")
public class Employer extends User {

  private String company;

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " from " + company;
  }

}
