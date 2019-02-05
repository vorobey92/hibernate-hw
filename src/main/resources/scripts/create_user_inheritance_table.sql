-- очень сомневаюсь по поводу того, нужны ли NOT NULL и если да, то где

create sequence user_id_seq;

create table user_inheritance_table (
    id INTEGER DEFAULT nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR(32) NOT NULL
);

create table employer_inheritance_table (
    id INTEGER DEFAULT nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    company VARCHAR NOT NULL
);

create table applicant_inheritance_table (
    id INTEGER DEFAULT nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR (32) NOT NULL,
    position VARCHAR NOT NULL
);
