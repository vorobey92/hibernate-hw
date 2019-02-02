-- очень сомневаюсь по поводу того, нужны ли NOT NULL и если да, то где

create sequence user_id_seq;

create table user_inheritance_table (
    id INTEGER NOT NULL DEFAULT nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR NOT NULL
);

create table employer_inheritance_table (
    id INTEGER NOT NULL DEFAULT nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR NOT NULL,
    company VARCHAR NOT NULL
);

create table applicant_inheritance_table (
    id INTEGER NOT NULL DEFAULT nextval('user_id_seq') PRIMARY KEY,
    NAME VARCHAR NOT NULL,
    position VARCHAR NOT NULL
);
