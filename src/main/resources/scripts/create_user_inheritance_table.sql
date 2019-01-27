create sequence user_id_seq;

create table user_inheritance_table (
    id INTEGER default nextval('user_id_seq') PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

create table employer_inheritance_table (
    id INTEGER PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    company VARCHAR(200)
);

create table applicant_inheritance_table (
    id INTEGER PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    position VARCHAR(200)    
);
