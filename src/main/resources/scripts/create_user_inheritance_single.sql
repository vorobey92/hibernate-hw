create table user_inheritance_single (
  id serial primary key,
  name varchar(100)  not null,
  company varchar(100),
  position varchar(100),
  dtype varchar(100)
);
