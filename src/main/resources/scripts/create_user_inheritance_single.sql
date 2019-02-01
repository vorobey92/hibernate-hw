create table user_inheritance_single (
    dtype varchar(31) not null,
    id serial primary key,
    name varchar(50) not null,
    company varchar(50),
    position varchar(50)
 );
