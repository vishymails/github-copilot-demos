drop table if exists customer;

create table customer (
    id int auto_increment primary key,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    email varchar(50) not null,
    password varchar(50) not null
);

drop table if exists product;

create table product (
    id int auto_increment primary key,
    name varchar(50) not null,
    price double not null,
    description varchar(50) not null
);

drop table if exists orders;

create table orders (
    id int auto_increment primary key,
    customer_id int not null,
    order_date date not null,
    quantity int not null,
    price double not null,
    status varchar(50) not null
);