create table user_inheritance_single (
  id serial primary key,
  name varchar(255) not null, -- общее для всех, может быть not null
  company varchar(255),
  position varchar(255),
  dtype varchar(255) not null -- используется по умолчанию, если не определен Discriminator
);
