create database coffee_str;
use coffee_str;

create table products(
id int auto_increment primary key,
name varchar(30),
price decimal(4,2),
coffee_origin varchar(30)
);

create table orders(
id int auto_increment primary key,
product_id int,
customer_id int,
order_time datetime
);

create table customers(
id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
gender enum('M','F'),
phone_number varchar(11)
);
-- entering a row of data
insert into products(name,price,coffee_origin)
values('Espresso',2.50,'Brazil');
 
-- entering multiple rows of data

insert into products(name,price,coffee_origin)
values('Macchiato',3.00,'Brazil'),('Cappuccino',3.50,'Cost Rica'); 

insert into products(name,price,coffee_origin)
values('Latte',3.50,'Indonesia'),('Americano',3.00,'Brazil'),('Flat White',3.50,'Indonesia'),('Filter',3.00,'India');
select*from products;
-- entering a row of data
insert into products(name,price,coffee_origin)
values('Espresso',2.50,'Brazil');
 
-- entering multiple rows of data

insert into products(name,price,coffee_origin)
values('Macchiato',3.00,'Brazil'),('Cappuccino',3.50,'Cost Rica'); 

insert into products(name,price,coffee_origin)
values('Latte',3.50,'Indonesia'),('Americano',3.00,'Brazil'),('Flat White',3.50,'Indonesia'),('Filter',3.00,'India');
create database test2;
use test2;
show tables;

create table people(
id int auto_increment primary key,
name varchar(30),
age int,
gender enum('M','F')
);

insert into people(name,age,gender)
values ('Emma',21,'F'),('John',30,'M'),('Thomas',27,'M'),('Chris',44,'M'),('Sally',23,'F'),('Frank',55,'M');

select * from people;
set sql_safe_updates=0;
-- deleting a selected row
delete from people
where name='John';
-- deleting multiple rows
delete from people
where gender='F';
-- to delete all the data
delete from people;
