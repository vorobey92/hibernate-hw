create table user_inheritance_joined (
  id serial primary key,
  name varchar(124) not null
);

create table employer_inheritance_joined (
  id int references user_inheritance_joined primary key,
  company varchar(255) not null
);

create table applicant_inheritance_joined (
  id int references user_inheritance_joined primary key,
  position varchar(255) not null
);
