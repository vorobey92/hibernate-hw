
create table user_inheritance_joined (
  id serial primary key,
  name varchar(100) not null
);

create table employer_inheritance_joined (
  id integer references user_inheritance_joined (id),
  company varchar(100) not null
);

create table applicant_inheritance_joined (
  id integer references user_inheritance_joined (id),
  position varchar(100) not null
);
