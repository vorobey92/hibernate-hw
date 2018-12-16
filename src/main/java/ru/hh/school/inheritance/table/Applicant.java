package ru.hh.school.inheritance.table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "ApplicantTable")
@Table(name = "applicant_inheritance_table")
public class Applicant extends User {

  private String position;

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " the " + position;
  }
}
