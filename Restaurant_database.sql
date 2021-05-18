show databases;
create database restaurant;
use restaurant;

create table Customer (
	customerID int not null UNIQUE,
    customerUsername varchar(50) not null UNIQUE,
	customerPhone varchar(15)not null,
    customerEmail varchar(100) not null,
    customerAddress varchar(100) not null,
    customerZipcode varchar(10) not null,
    customerName varchar(50) not null,
    customerPassword varchar(20) not null,
    customerRewards int not null,
    PRIMARY KEY(customerUsername)
);

create table Food_Order (
	orderID int not null UNIQUE,
    customerUsername varchar(50) not null,
    orderList varchar(500) not null,
    address varchar(100) not null,
    zipcode int not null,
    orderStatus varchar(45) not null,
    primary key(orderID),
    FOREIGN KEY (customerUsername) REFERENCES Customer(customerUsername)
);

CREATE TABLE Manager (
  managerUsername varchar(45) not null UNIQUE,
  managerPassword varchar(45) not null,
  managerName varchar(45) not null,
  managerPhone varchar(45) not null,
  PRIMARY KEY (managerUsername)
);

create table Menu (
	itemID int not null UNIQUE,
	itemType varchar(50) not null,
    itemName varchar(50) not null,
	itemPrice float not null,
    managerUsername varchar(45) not null,
    PRIMARY KEY(itemID),
    FOREIGN KEY (managerUsername) REFERENCES Manager (managerUsername)
);
