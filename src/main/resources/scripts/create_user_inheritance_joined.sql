
create table user_inheritance_joined (
  id serial primary key,
  name varchar(124)
);

create table employer_inheritance_joined (
  id serial primary key,
  company varchar(124)
);

create table applicant_inheritance_joined (
  id serial primary key,
  position varchar(124)
);
