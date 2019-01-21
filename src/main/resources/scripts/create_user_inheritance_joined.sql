
create table user_inheritance_joined (
  id not null serial primary key,
  name varchar(124) not null
);

create table employer_inheritance_joined (
  id not null serial primary key,
  company varchar(124)
);

create table applicant_inheritance_joined (
  id not null serial primary key,
  position varchar(124)
);
