create database example;
use example;

create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
SHOW CREATE TABLE addresses;

alter table addresses
add primary key (id);
describe addresses;

alter table addresses
add constraint address unique (id);
describe addresses;


create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
SHOW CREATE TABLE people;

alter table people
add primary key(id);
describe people;

alter table people
add constraint people unique (address_id);
describe people;

alter table people
add constraint fk_address_id
foreign key(address_id) references people(id);
describe  people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
SHOW CREATE TABLE pets;

alter table pets
add primary key(id);
describe people;

alter table pets
add constraint pet unique (owner_id);
describe pets;

alter table pets
add constraint fk_ownerid
foreign key(owner_id) references pets(id);
describe  pets;

alter table pets change column `species` `variety` varchar(20);
describe pets;

