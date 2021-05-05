show databases;
create database restaurant;
use restaurant;

create table Menu (
	menu_itemID int not null,
    itemName varchar(50) not null,
    itemRank int not null,
	itemPrice int not null,
    PRIMARY KEY(menu_itemID)
);

create table Food_Order (
	orderID int not null UNIQUE,
    menu_itemID int not null,
    customerName varchar(50) not null,
    foodItems varchar(400) not null,
    address varchar(100) not null,
    zipcode int not null,
    orderStatus varchar(45) not null,
    primary key(orderID),
    FOREIGN KEY(menu_itemID) REFERENCES Menu(menu_itemID)
);

create table Customer (
	customerID int not NULL UNIQUE,
    customerName varchar(50) not null,
	customerPhone varchar(15)not null,
    customerAddress varchar(100) not null,
    customerZipcode int not null,
    customerUsername varchar(20) not null,
    customerPassword varchar(20) not null,
    #customerRewards int not null, // should be implemented elsewhere
    #orderID int not null,  //should be implemented elsewhere
    PRIMARY KEY(customerID)
    #FOREIGN KEY(orderID) REFERENCES Food_Order(orderID)
);

create table Delivery (
	deliveryPhone int not null,
	deliveryName varchar(50) not null,
    deliveryZipcode int not null,
    orderID int not null,
    customerPhone int not null,
    customerID int not null,
    PRIMARY KEY(deliveryPhone),
    FOREIGN KEY(orderID) REFERENCES Food_Order(orderID),
    FOREIGN KEY(customerID) REFERENCES Customer(customerID)
);
    
create table Inventory (
  ItemID int not null UNIQUE,
  menu_itemID int not null ,
  AvailableQuantity int not null,
  Price int not null,
  PRIMARY KEY (ItemID),
  FOREIGN KEY (menu_itemID) REFERENCES Menu(menu_itemID)
);

CREATE TABLE Manager (
  managerUsername varchar(45) not null,
  managerPassword varchar(45) not null,
  managerName varchar(45) not null,
  managerPhone varchar(45) not null,
  PRIMARY KEY (managerUsername)
);

CREATE TABLE Rewards (
  RewardID int not null,
  customerID int not null,
  RewardAmount int not null,
  PRIMARY KEY (RewardID),
  FOREIGN KEY (customerID) REFERENCES Customer(customerID)
)