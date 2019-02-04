create sequence user_id_seq;

create table user_inheritance_table (
id integer not null default nextval('user_id_seq') primary key,
name varchar(128)
);

create table employer_inheritance_table (
id integer not null default nextval('user_id_seq') primary key,
name varchar(128),
company varchar(128)
);

create table applicant_inheritance_table (
id integer not null default nextval('user_id_seq') primary key,
name varchar(128),
position varchar(128)
);
