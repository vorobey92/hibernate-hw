create sequence user_id_seq;

create table user_inheritance_table (
  id serial primary key,
  name varchar(100) not null
);

create table employer_inheritance_table (
  id serial primary key,
  name varchar(100) not null,
  company varchar(100) not null
);

create table applicant_inheritance_table (
  id serial primary key,
  name varchar(100) not null,
  position varchar(100) not null
);
