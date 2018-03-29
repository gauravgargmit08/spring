create table quotes_info (
id integer not null ,
location varchar(255) not null,
tobacco varchar(255) not null,
amount DECIMAL(20, 2) not null,
insurance_type int not null,
tenure int not null,
basepremium int not null,
companyname varchar(255) not null,
primary key(id)
);



