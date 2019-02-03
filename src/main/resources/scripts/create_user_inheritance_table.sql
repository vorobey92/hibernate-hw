create sequence user_id_seq;

create table user_inheritance_table (
    id serial primary key,
    name varchar
);

create table employer_inheritance_table (
    id serial primary key,
    name varchar,
    company varchar
);

create table applicant_inheritance_table (
    id serial primary key,
    name varchar,
    position varchar
);
