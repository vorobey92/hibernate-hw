package ru.hh.school.batching;

import javax.persistence.*;


@Entity
@Table (name = "resume")
public class Resume {

  @Id
  // ToDo сделать так, чтобы id брался из sequence-а
  // таким образом, мы сможем отправлять в бд запросы батчами.
  // Подробнее:
  // https://vladmihalcea.com/how-to-batch-insert-and-update-statements-with-hibernate/
  // https://vladmihalcea.com/from-jpa-to-hibernates-legacy-and-enhanced-identifier-generators/
  @SequenceGenerator(name = "mySeqGen", sequenceName = "resume_id_seq", allocationSize = 10)
  @GeneratedValue(generator = "mySeqGen")
  private int id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
