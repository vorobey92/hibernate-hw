
create table user_inheritance_joined (
id serial primary key,
name varchar(128)
);

create table employer_inheritance_joined (
id integer primary key references user_inheritance_joined(id),
company varchar(128)
);

create table applicant_inheritance_joined (
id integer primary key references user_inheritance_joined(id),
position varchar(128)
);
