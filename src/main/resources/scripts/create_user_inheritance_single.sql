create table user_inheritance_single (
  dtype    VARCHAR(31) NOT NULL,
  id       SERIAL PRIMARY KEY,
  name     CHAR(124),
  position CHAR(124),
  company  CHAR(124)
);
