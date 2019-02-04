package ru.hh.school.inheritance.single;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "ApplicantSingle")
public class Applicant extends User {

  @Column(name = "position")
  private String position;

  public void setPosition(String position) {
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " the " + position;
  }
}
