create table user_inheritance_single (
id serial primary key,
dtype varchar(128) not null,
name varchar(128),
company varchar(128),
position varchar(128)
);
