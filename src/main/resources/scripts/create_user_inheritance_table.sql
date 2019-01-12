create sequence user_id_seq;

create table user_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124)
);

create table employer_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124),
  company varchar(124)
);

create table applicant_inheritance_table (
  id int primary key default nextval('user_id_seq'),
  name varchar(124),
  position varchar(124)
);
