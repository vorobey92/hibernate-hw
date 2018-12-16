package ru.hh.school.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "ApplicantJoined")
@Table(name = "applicant_inheritance_joined")
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
