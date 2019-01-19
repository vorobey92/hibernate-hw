package ru.hh.school.inheritance.single;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "UserSingle")
@Table(name = "user_inheritance_single")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//Перенес из inheritance.single.Employer
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
