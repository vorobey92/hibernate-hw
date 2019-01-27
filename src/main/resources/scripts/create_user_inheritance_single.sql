create table user_inheritance_single (
    id SERIAL PRIMARY KEY,
    DTYPE VARCHAR(31) NOT NULL,
    name VARCHAR(200) NOT NULL,
    company VARCHAR(200),
    position VARCHAR(200)
);
