package ru.hh.school.users;

/**
 * ToDo оформите entity
 *
 * @see scripts/create_users.sql
 *
 * https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html#entity
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name =  "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name =  "first_name")
  private String firstName;

  @Column(name =  "last_name")
  private String lastName;

  User(){}

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

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
