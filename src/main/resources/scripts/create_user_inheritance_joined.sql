
create table user_inheritance_joined (
  id SERIAL PRIMARY KEY,
  name varchar(124) NOT NULL
);

create table employer_inheritance_joined (
  id INTEGER NOT NULL PRIMARY KEY REFERENCES user_inheritance_joined,
  company VARCHAR(124) NOT NULL
);

create table applicant_inheritance_joined (
  id INTEGER NOT NULL PRIMARY KEY REFERENCES user_inheritance_joined,
  position VARCHAR(124) NOT NULL
);
