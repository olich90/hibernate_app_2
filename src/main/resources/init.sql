drop table if exists person_product;
drop table if exists person;
drop table if exists product;

create table if not exists person(
	id bigserial primary key,
	name varchar(255)
);

create table if not exists product(
	id bigserial primary key,
	title varchar(255),
	price int
);

create table if not exists person_product(
	person_id bigint,
	product_id bigint,
    foreign key (person_id) references person (id),
    foreign key (product_id) references product (id)
);

insert into person (name)
values('Alex'),
      ('Peter'),
      ('Mike'),
      ('Ann');

insert into product (title, price)
values('Notebook Lenovo', 1000),
('Notebook Dell', 900),
('Notebook Acer', 1100),
('Notebook HP', 800),
('Notebook Asus', 600);

insert into person_product (person_id, product_id)
values (1, 1),
       (1, 2),
       (2, 2),
       (2, 2),
       (3, 4),
       (3, 5);

select *
  from person p
  left join person_product pp
    on pp.person_id = p.id
  left join product pr
    on pr.id = pp.product_id;