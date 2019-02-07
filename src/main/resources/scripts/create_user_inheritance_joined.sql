
create table user_inheritance_joined (
  id   SERIAL PRIMARY KEY,
  name VARCHAR(124) NOT NULL
);

create table employer_inheritance_joined (
  id      SERIAL PRIMARY KEY REFERENCES user_inheritance_joined (id),
  company VARCHAR(124) NOT NULL
);

create table applicant_inheritance_joined (
  id       SERIAL PRIMARY KEY REFERENCES user_inheritance_joined (id),
  position VARCHAR(124) NOT NULL
);
