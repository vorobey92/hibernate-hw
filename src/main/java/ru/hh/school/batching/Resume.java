package ru.hh.school.batching;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table
public class Resume {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resume_id_seq")
  @SequenceGenerator(name = "resume_id_seq",  allocationSize = 10)
  private Integer id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
