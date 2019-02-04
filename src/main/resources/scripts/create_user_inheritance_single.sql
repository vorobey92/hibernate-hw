create table user_inheritance_single (
  id serial primary key,
  name varchar(128),
  company varchar(128),
  position varchar(128),
  dtype varchar(128) NOT NULL
);
