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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id") 
  private Integer id;
  
  @Column(name = "first_name") 
  private String firstName;
  
  @Column(name = "last_name")
  private String lastName;

  //No args constructor
  protected User() {
  }
  
  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  //Getters and Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer new_id) {
	this.id = new_id;
  }

  public String getFirstName() {
	  return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
	  return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  
}
