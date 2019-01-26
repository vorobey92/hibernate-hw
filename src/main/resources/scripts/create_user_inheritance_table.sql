create sequence user_id_seq;

create table user_inheritance_table (
    id INTEGER NOT NULL default nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR(200)
);

create table employer_inheritance_table (
    id INTEGER PRIMARY KEY,
    name VARCHAR(200),
    company VARCHAR(200)
);

create table applicant_inheritance_table (
    id INTEGER PRIMARY KEY,
    name VARCHAR(200),
    position VARCHAR(200)    
);
