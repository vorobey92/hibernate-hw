package ru.hh.school.batching;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Resume {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="resumeIdSeq")
  @SequenceGenerator(name="resumeIdSeq", sequenceName="resume_id_seq",
                     initialValue=1, allocationSize=10)
  private Integer id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
