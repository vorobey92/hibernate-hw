create table user_inheritance_single (
  dtype    VARCHAR(31) NOT NULL,
  id       SERIAL PRIMARY KEY,
  name     VARCHAR(124),
  position VARCHAR(124),
  company  VARCHAR(124)
);
