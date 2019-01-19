package ru.hh.school.inheritance.single;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "EmployerSingle")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//Должно быть в суперклассе
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
