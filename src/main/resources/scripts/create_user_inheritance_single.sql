create table user_inheritance_single (
  id serial primary key,
-- Each subclass in a hierarchy must define a unique discriminator value, which is used
-- to differentiate between rows belonging to separate subclass types. If this is not specified,
-- the DTYPE column is used as a discriminator, storing the associated subclass name.
  dtype varchar(31) not null,
  name varchar(124) not null,
  company varchar(255),
  position varchar(255)
);
