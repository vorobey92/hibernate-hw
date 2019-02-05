-- также минимум, позволяющий пройти тесты.

create table user_inheritance_joined (
    id SERIAL PRIMARY KEY,
    name VARCHAR (32) NOT NULL
);

create table employer_inheritance_joined (
   id INT PRIMARY KEY REFERENCES user_inheritance_joined(id),
    company VARCHAR (32) NOT NULL
);

create table applicant_inheritance_joined (
    id INT PRIMARY KEY REFERENCES user_inheritance_joined(id),
    position VARCHAR (32) NOT NULL
);
