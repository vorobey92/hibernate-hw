create table if not exists employer (
  employer_id serial primary key,
  company_name varchar(100) not null,
  employees_count int not null default 0,
  organization_form varchar(10),
  creation_time timestamp,
  bonus_points int not null default 0
);

create table if not exists vacancy (
  vacancy_id serial primary key,
  title varchar(100) not null,
  description varchar(255) default null,
  salary_amount int,
  salary_currency varchar(3),
  employer_id int not null,
  foreign key (employer_id) references employer(employer_id)
);
