create sequence user_id_seq;

create table user_inheritance_table (
  id integer not null default nextval('user_id_seq') primary key,
  name varchar(128) not null
);

create table employer_inheritance_table (
  id integer not null default nextval('user_id_seq') primary key,
  name varchar(128) not null,
  company varchar(128) not null
);

create table applicant_inheritance_table (
 id integer not null default nextval('user_id_seq') primary key,
 name varchar(128) not null,
 position varchar(128) not null
);
