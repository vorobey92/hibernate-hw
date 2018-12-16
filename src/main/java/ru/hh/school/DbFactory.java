package ru.hh.school;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.hh.school.batching.Resume;
import ru.hh.school.employers.Employer;
import ru.hh.school.employers.Vacancy;
import ru.hh.school.users.User;
import java.util.List;

public class DbFactory {

  private static final List<Class<?>> ENTITY_CLASSES_REGISTRY = List.of(
    User.class,
    Employer.class, Vacancy.class,
    Resume.class,

    ru.hh.school.inheritance.single.User.class,
    ru.hh.school.inheritance.single.Employer.class,
    ru.hh.school.inheritance.single.Applicant.class,

    ru.hh.school.inheritance.joined.User.class,
    ru.hh.school.inheritance.joined.Employer.class,
    ru.hh.school.inheritance.joined.Applicant.class,

    ru.hh.school.inheritance.table.User.class,
    ru.hh.school.inheritance.table.Employer.class,
    ru.hh.school.inheritance.table.Applicant.class

  );

  public static SessionFactory createSessionFactory() {
    StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
      .loadProperties("hibernate.properties")
      .build();

    MetadataSources metadataSources = new MetadataSources(serviceRegistry);
    ENTITY_CLASSES_REGISTRY.forEach(metadataSources::addAnnotatedClass);

    return metadataSources.buildMetadata().buildSessionFactory();
  }

}
