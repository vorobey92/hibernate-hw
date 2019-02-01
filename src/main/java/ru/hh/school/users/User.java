package ru.hh.school.users;

import javax.persistence.*;

/**
 * ToDo оформите entity
 *
 * @see scripts/create_users.sql
 *
 * https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html#entity
 */
@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  public User() {
  }

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

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
