
create table user_inheritance_joined (
  id serial primary key,
  name varchar(128) not null
);

create table employer_inheritance_joined (
  id serial primary key,
  company varchar(128) not null
);

create table applicant_inheritance_joined (
  id serial primary key,
  position varchar(128) not null
);
