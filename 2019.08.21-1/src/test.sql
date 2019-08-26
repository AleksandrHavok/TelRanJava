mysql -u root -p
show databases;
create database testDB;
drop database testDB;
create database if not exists testDB;
show warnings;
drop database if exists testDB;
show create database testDB;/*пишем только после создания таблицы, таблица*/
show create database testDB\G/*пишем только после создания таблицы, строка*/
use testDB;
select database();
/*
int 
integer
smallint
bigint
decimal
varchar
char
text
time
date
datetime
timestamp эпоха unix
*/
show tables;
create table if not exists `users`(
`id` int, 
`name` varchar(15),
`email` varchar(30),
`age` int(3));

describe `users`;

alter table `users`add column `b_day` date,drop column `age`;

droptable `users`;

create table if not exists `users`(
`id` int, 
`name` varchar(15),
`email` varchar(30),
`age` int(3));

insert into `users` values (1234,'Vasya','vasya@mail.com',25);

insert into `users` values (4321,'Petya','petya@mail.com',32);
insert into `users` values (6789,'Sofa','sofa@mail.com',21);
insert into `users` values (4567,'David','david@mail.com',19);

insert into `users`(`id`,`name`,`age`)
values(5434,'Anna',25),
(9999,'TEST',99);

delete from users;

create table if not exists `users`(
`id` int, 
`name` varchar(15),
`email` varchar(30),
`age` int(3));
insert into `users` values (1234,'Vasya','vasya@mail.com',25);

insert into `users` values (4321,'Petya','petya@mail.com',32);
insert into `users` values (6789,'Sofa','sofa@mail.com',21);
insert into `users` values (4567,'David','david@mail.com',19);

insert into `users`(`id`,`name`,`age`)
values(5434,'Anna',25),
(9999,'TEST',99);

delete from users where `name`='Petya';
update `users` set
`email`='super.david@gmail.com', `age`=20
where `id`=4567;

select * from `users`;
select `name`,`email`,`age` from `users`;
select `name` as `User name` from `users`;

select * from `users` where `id`=4567;
select 1+1;

create table if not exists products(
`name` varchar(30) not null default 'NoName',
`manufacture` varchar(30) not null default 'Unknown',
`type` varchar(20) not null default 'Unknown',
`price` Decimal(10,2) not null default 0.00,
`count` int not null default 0);
describe products;

insert into `products` values
('Galaxe S10', 'Samsung','phone',4000.00,10),
('Iplone XS','Apple','phone',4000.00,5),
('O-11','HTC','phone',2500.00,7),
('Macbook Pro','Apple','laptop',12000.00,3),
('I730','Lenovo','laptop',8000.00,4),
('Aspire 5','Acer','laptop',8200.00,3);
insert into `products`(`manufacture`,`type`,`price`) values
('Apple','phone',4500.00);

select  `name`, `manufacture`,`price`*`count` as `total` from `products`;
select  `name`, `manufacture`,`price`*`count` as `total amount` from `products` where `type`='phone';

/*
in,not in
between, not between
is null, is not null /*like не возвращает элементы содержащие null*/

select * from table where in (value1...valueN);
select * from where column between valuefrom and valueto;

select * from table where column is null;
*/

insert into `users` values (4321,'Petya','petya@gmail.com',32);
insert into `users` values (6789,'Sofa','sofa@gmail.com',21);
insert into `users` values (4567,'David','david@yandex.ru',19);

select*from `users` where `email` like '%yandex.ru';
select*from `users` where `email` not like '%yandex.ru';
select * from `users` where `email`like '____@%';

/*limit a - вывести а значений
limit a,b- вывести b значений начиная с a
*/
select* from `products` order by `price` desc limit 1;
select* from `products` where `type`='phone' order by `price` desc limit 1;
select* from `products` where `type`='phone' and `count`>0 order by `price` desc limit 1;
select* from `products` where `type`='phone' and `count`>0 order by `price` desc limit 1,2;

/*distinct*/

/*аггрегации. всегда возвращает одну строку
count
max
min
avg
sum
*/

select avg(`price`) from `products` where `type`='phone' and `count`>0;
select count(distinct `manufacture`) from `products`;/*посчитает количество производителей*/

/*group by по стобцу*/
select group_concat(distinct `manufacture` separator ',') as manufacture, 
sum(`count`) as summary 
from `products`;/*посчитать сколько всего есть на складе товаров*/

select group_concat(distinct `manufacture`) from `products`;
select `manufacture`, count(*) 
from `products` 
group by `manufacture`;/*посчитает сколько типов товаров есть у производителей*/

select `manufacture`, count(*) 
from `products` 
group by `manufacture`
order by `count(*)` desc;

select `manufacture`, count(*) as count
from `products` 
group by `manufacture`
order by `count(*)` desc;

select `manufacture`,group_concat(distinct `name`) as `models`,
sum(`price`) as sumPrice 
from `products`
group by`manufacture`;

select `manufacture`,group_concat(distinct `name`) as `models`,
sum(`price`) as sumPrice 
from `products`
group by`manufacture`
having sum(`price`)>8000;

select `manufacture`,group_concat(distinct `name`) as `models`,
sum(`price`) as sumPrice 
from `products`
group by`manufacture`
having sumPrice>8000;

drop table products;
drop table users;

create table if not exists `users`(
`id` int, 
`name` varchar(15),
`email` varchar(30),
`age` int(3),
primary key(`id`),
key users_email_key(`email`)
);

insert into `users` values
(1234,'Vasya','vasya@mail.ru',23);

create table `addresses`(
`id` INT auto_increment,
`street` varchar(30),
`house_number` INT(3),
`apartment_number` varchar (10),
primary key(`id`)
);

insert into `addresses` (`street`,
						 `house_number`,
						 `apartment_number`)
values
('Herzl',10,'12'),
('Rotshild',100,'2a'),
('Plaut',10,'102');

insert into `addresses` (`id`,`street`,
						 `house_number`,
						 `apartment_number`)
values
(1000,'Herzl',10,'12');

insert into `addresses` (`street`,
						 `house_number`,
						 `apartment_number`)
values
('Herzl',10,'12');

create table if not exists products(
`id` INT unsigned auto_increment,
`name` varchar(30) not null default 'NoName',
`type` varchar(20) not null default 'Unknown',
`price` Decimal(10,2) not null default 0.00,
`count` int not null default 0,
`m_id` INT unsigned,
primary key(`id`),
foreign key (`m_id`) references `manufacture`(`id`)
);

create table `manufacture`(
`id` int unsigned,
`name` varchar(30) not null default 'Unknown',
`country` varchar(30) not null default 'Unknown',
primary key (id)
);

insert into `manufacture` values
(123,'Samsung','Korea'),
(321,'Apple','USA'),
(555,'Lenovo','China');

insert into `products` values
(1,'Galaxy S10','phone',4000.00,10,123),
(2,'Iplone XS','phone',4000.00,5,321),
(3,'O-11','phone',2500.00,7,555),
(4,'Macbook Pro','laptop',12000.00,3,321),
(5,'I730','laptop',8000.00,4,555),
(6,'Aspire 5','laptop',8200.00,3,555);

insert into `products` values
(7,'SuperPhone','phone',10000.00,0,NULL),
(8,'SuperLaptop','phone',10000.00,0,NULL);

insert into `products` values
(10,'SuperPhone','phone',10000.00,0,656);

insert into `manufacture` values
(987,'Xiaomi','China');

select * from `products`,`manufacture`
where `products`.`m_id`=`manufacture`.`id`;

select * from products p
join manufacture m on p.m_id=m.id;

select * from products p
left join manufacture m on p.m_id=m.id;

select * from products p
right join manufacture m on p.m_id=m.id;

drop table manufacture;
show index from products;
show constraint from products;
alter table products drop foreign key m_id;