drop table if exists user_inheritance_joined;
drop table if exists employer_inheritance_joined;
drop table if exists applicant_inheritance_joined;

create table user_inheritance_joined (
    id serial primary key,
    name varchar
);

create table employer_inheritance_joined (
    id serial primary key,
    company varchar
);

create table applicant_inheritance_joined (
    id serial primary key,
    position varchar
);

alter table employer_inheritance_joined
add constraint FKihw8h3j1k0w31cnyu7jcl7n7n
foreign key (id) references user_inheritance_joined;

alter table applicant_inheritance_joined
add constraint FKihw8h3j1k0w31cnyu7jcl7n7n
foreign key (id) references user_inheritance_joined;
