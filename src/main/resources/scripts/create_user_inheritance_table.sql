create sequence user_id_seq;

create table user_inheritance_table (
  id   INTEGER default nextval('user_id_seq') PRIMARY KEY,
  name CHAR(124)
);

create table employer_inheritance_table (
  id      INTEGER default nextval('user_id_seq') PRIMARY KEY,
  name    CHAR(124),
  company CHAR(124)
);

create table applicant_inheritance_table (
  id       INTEGER default nextval('user_id_seq') PRIMARY KEY,
  name     CHAR(124),
  position CHAR(124)
);
