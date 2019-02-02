-- минимальная необходимая структура, которая позволяет тестам пройти успешно.

create table user_inheritance_single (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    company VARCHAR,
    position VARCHAR,
    DTYPE VARCHAR
);
