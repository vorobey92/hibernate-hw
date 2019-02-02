package ru.hh.school.batching;

import javax.persistence.*;

@Entity
@Table
public class Resume {


  // ToDo сделать так, чтобы id брался из sequence-а
  // таким образом, мы сможем отправлять в бд запросы батчами.
  // Подробнее:
  // https://vladmihalcea.com/how-to-batch-insert-and-update-statements-with-hibernate/
  // https://vladmihalcea.com/from-jpa-to-hibernates-legacy-and-enhanced-identifier-generators/

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resume_id_seq")
  @SequenceGenerator(name = "resume_id_seq")
  private Integer id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
