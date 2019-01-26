package ru.hh.school.inheritance.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "ApplicantSingle")
@DiscriminatorValue("Applicant")
public class Applicant extends User {

  private String position;

  public Applicant() {
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " the " + position;
  }
}
