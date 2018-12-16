package ru.hh.school.batching;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Resume {

  @Id
  // ToDo сделать так, чтобы id брался из sequence-а
  // таким образом, мы сможем отправлять в бд запросы батчами.
  // Подробнее:
  // https://vladmihalcea.com/how-to-batch-insert-and-update-statements-with-hibernate/
  // https://vladmihalcea.com/from-jpa-to-hibernates-legacy-and-enhanced-identifier-generators/
  @GeneratedValue(/* здесь место для вашего кода */)
  private Integer id;

  private String description;

  Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
