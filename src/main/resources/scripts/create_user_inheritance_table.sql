create sequence user_id_seq;

create table user_inheritance_table (
  id int not null default nextval('user_id_seq') primary key,
  name varchar(124)
);

create table employer_inheritance_table (
  id int not null default nextval('user_id_seq') primary key,
  name varchar(124),
  company varchar(124)
);

create table applicant_inheritance_table (
  id int not null default nextval('user_id_seq') primary key,
  name varchar(124),
  position varchar(124)
);
