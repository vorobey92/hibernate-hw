package ru.hh.school.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "UserJoined")
@Table(name = "user_inheritance_joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  public User() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String generateGreeting() {
    return "Hello, " + name;
  }

}
