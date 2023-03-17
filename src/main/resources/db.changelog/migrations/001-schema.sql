--liquibase formatted sql

--changeset lushnikov:1
create table netology.BRANDS(
                                id serial primary key ,
                                brand_name varchar(100) not null
);
--rollback drop table brands;