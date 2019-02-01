create sequence user_id_seq;

create table user_inheritance_table (
  id serial primary key,
  name varchar(100)
);

create table employer_inheritance_table (
  id serial primary key,
  name varchar(100),
  company varchar(100)
);

create table applicant_inheritance_table (
  id serial primary key,
  name varchar(100),
  company varchar(100),
  position varchar(100)
);
