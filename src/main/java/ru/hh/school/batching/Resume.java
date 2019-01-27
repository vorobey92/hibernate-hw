package ru.hh.school.batching;

import javax.persistence.*;

@Entity
@Table
public class Resume {

  @Id
  //Вариант 1
  @GeneratedValue(generator = "resume_id_seq", strategy=GenerationType.SEQUENCE)
  @SequenceGenerator(name = "resume_id_seq", allocationSize = 10)
  // Вариант 2: поменять название последовательности
  // в create_resume.sql с resume_id_seq на HIBERNATE_SEQUENCE
  private Integer id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
