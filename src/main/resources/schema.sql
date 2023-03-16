create table netology.CUSTOMERS(
                                   id serial primary key ,
                                   "name" varchar(50) not null ,
                                   surname varchar(50) not null ,
                                   age int not null ,
                                   phone_number varchar(20) not null
);

create table netology.ORDERS(
                                id serial primary key ,
                                "date" date not null ,
                                customer_id int not null references netology.CUSTOMERS(id),
                                product_name varchar(100) not null ,
                                amount int not null
);
