create sequence user_id_seq;

create table user_inheritance_table (
    id serial primary key,
    name varchar(30)
);

create table employer_inheritance_table (
    id serial primary key,
    name varchar(30),
    company varchar(30)
);

create table applicant_inheritance_table (
    id serial primary key,
    name varchar(30),
    position varchar(30)
);
