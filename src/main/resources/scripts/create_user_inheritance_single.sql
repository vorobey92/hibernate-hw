create table user_inheritance_single (
  DTYPE varchar(31) not null,
  id serial primary key,
  name varchar(124) not null,
  position varchar(124),
  company varchar(124)
);

