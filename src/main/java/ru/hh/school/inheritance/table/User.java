package ru.hh.school.inheritance.table;

import javax.persistence.*;

@Entity(name = "UserTable")
@Table(name = "user_inheritance_table")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
  @SequenceGenerator(name = "user_id_seq",allocationSize = 1)
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
