create table user_inheritance_single (
  DTYPE VARCHAR(31) NOT NULL,
  id serial primary key,
  name varchar(124) NOT NULL,
  company VARCHAR(124),
  position VARCHAR(124)
);
