
create table user_inheritance_joined (
    id serial primary key,
    name varchar(50) not null

);

create table employer_inheritance_joined (
    id int primary key references user_inheritance_joined(id),
    company varchar(50)
);

create table applicant_inheritance_joined (
    id int primary key references user_inheritance_joined(id),
    position varchar(50)
);
