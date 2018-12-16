-- employers
INSERT INTO employer(employer_id, company_name, employees_count, organization_form, creation_time)
  VALUES (1, 'Blues Bar', 10, 'OAO', '2018-01-01');
INSERT INTO employer(employer_id, company_name, employees_count, organization_form, creation_time)
  VALUES (2, 'Jazz Club', 15, 'OOO', '2018-02-02');
INSERT INTO employer(employer_id, company_name, employees_count, organization_form, creation_time)
  VALUES (3, 'Rock Cafe', 20, 'IP', '2018-03-03');
INSERT INTO employer(employer_id, company_name, employees_count, organization_form, creation_time)
  VALUES (4, 'Metal Basement', 5, 'ZAO', '2018-04-04');

-- vacancies
INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (1, 'Sad man with guitar', 'Oh yeah. The blues has got me.', 1, 100, 'USD');
INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (2, 'Another sad guy', null, 1, 75, 'EUR');
INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (3, 'And one more', null, 1, 50, 'GBP');

INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (4, 'Saxophonist', null, 2, 80, 'USD');

INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (5, 'Lennon clone', null, 3, 10000, 'RUR');

INSERT INTO vacancy(vacancy_id, title, description, employer_id, salary_amount, salary_currency)
  VALUES (6, 'Guy with long hair', null, 4, 1, 'USD');
