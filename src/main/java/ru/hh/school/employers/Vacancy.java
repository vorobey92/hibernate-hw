package ru.hh.school.employers;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "vacancy")
public class Vacancy {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "vacancy_id")
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "employer_id")
  private Employer employer;

  // если имя поля совпадает с именем колонки в таблице - аннотация @Column не обязательна
  private String title;

  private String description;

  @Embedded
  private Salary salary;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vacancy vacancy = (Vacancy) o;
    return Objects.equals(id, vacancy.id);
  }

  @Override
  public int hashCode() {
    return 17;
  }

}
