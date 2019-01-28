create table user_inheritance_single (
    dtype varchar(128) NOT NULL,
    id serial primary key,
    name varchar(128) not null,
    company varchar(128),
    position varchar(128)
);