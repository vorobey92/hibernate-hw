package ru.hh.school.users;

/**
 * ToDo оформите entity
 *
 * @see scripts/create_users.sql
 *
 * https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html#entity
 */
public class User {

  private Integer id;
  private String firstName;
  private String lastName;

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
