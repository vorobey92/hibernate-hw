
create table user_inheritance_joined (
  id   SERIAL PRIMARY KEY,
  name CHAR(124)
);

create table employer_inheritance_joined (
  id      SERIAL PRIMARY KEY REFERENCES user_inheritance_joined (id),
  company CHAR(124)
);

create table applicant_inheritance_joined (
  id       SERIAL PRIMARY KEY REFERENCES user_inheritance_joined (id),
  position CHAR(124)
);
