package ru.hh.school.inheritance.table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "EmployerTable")
@Table(name = "employer_inheritance_table")
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
