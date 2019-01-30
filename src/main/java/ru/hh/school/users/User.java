package ru.hh.school.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="user_id")
  private Integer id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  private User() {}

  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Integer getId() {
    return id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

}
