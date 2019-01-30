create sequence user_id_seq;

create table user_inheritance_table (
  id INTEGER DEFAULT nextval('user_id_seq') NOT NULL,
  name varchar(124)
);

create table employer_inheritance_table (
  id INTEGER DEFAULT nextval('user_id_seq') NOT NULL,
  name varchar(124),
  company VARCHAR(124)
);

create table applicant_inheritance_table (
  id INTEGER DEFAULT nextval('user_id_seq') NOT NULL,
  name varchar(124),
  position VARCHAR(124)
);
