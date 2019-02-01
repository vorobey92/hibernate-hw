package ru.hh.school.inheritance.single;

import javax.persistence.*;

@Entity(name = "UserSingle")
@Table(name = "user_inheritance_single")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  public User() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String generateGreeting() {
    return "Hello, " + name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
}
