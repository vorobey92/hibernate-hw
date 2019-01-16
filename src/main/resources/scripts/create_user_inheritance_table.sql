create sequence user_id_seq;

create table user_inheritance_table (
  id int not null default nextval('user_id_seq') primary key, -- используем общий sequence для всех наследников
  name varchar(255) not null
);

create table employer_inheritance_table (
  id int not null default nextval('user_id_seq') primary key,
  name varchar(255) not null,
  company varchar(255) not null
);

create table applicant_inheritance_table (
 id int not null default nextval('user_id_seq') primary key,
 name varchar(255) not null,
 position varchar(255) not null
);
