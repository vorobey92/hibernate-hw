create sequence user_id_seq;

create table user_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124) not null
);

create table employer_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124) not null,
  company varchar(124) not null
);

create table applicant_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124) not null,
  position varchar(124) not null
);
