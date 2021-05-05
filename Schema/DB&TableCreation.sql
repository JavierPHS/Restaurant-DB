DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS rewards;
DROP TABLE IF EXISTS delivery;

create database Restaurant;  
use Restaurant;  

CREATE TABLE IF NOT EXISTS food_order(
	orderID INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    menuItemID INT UNSIGNED NOT NULL,
    customerName VARCHAR (50) NOT NULL,
    foodItems VARCHAR(400) NOT NULL,
    address VARCHAR (100) NOT NULL,
    zipCode INT UNSIGNED NOT NULL,
    orderStatus VARCHAR(45)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS customer(
	customerName VARCHAR(50)NOT NULL, 
    customerID INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	customerPhone INT UNSIGNED NOT NULL, 
	customerAddress VARCHAR (100) NOT NULL,
	customerZipCode INT UNSIGNED NOT NULL,
	customerUsername VARCHAR (20) NOT NULL,
	customerPassword VARCHAR (20) NOT NULL,
	customerRewards INT UNSIGNED NOT NULL,
    hasAccount TINYINT(1) DEFAULT 0,
	orderID INT UNSIGNED NOT NULL,
	CONSTRAINT'fkOrderID'
    FOREIGN KEY (orderID)
) ENGINE = INNODB;
                        
CREATE TABLE IF NOT EXISTS rewards(
	rewardID INT(15) PRIMARY KEY, 
	customerName VARCHAR (50), 
	rewardAmount INT(15)
);
                     
 CREATE TABLE IF NOT EXISTS delivery(
	deliveryPhone INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    deliveryName VARCHAR(50) NOT NULL,
    deliveryZipCode INT UNSIGNED NOT NULL,
    customerPhone INT UNSIGNED NOT NULL,
    customerName VARCHAR (50) NOT NULL,

    orderID INT UNSIGNED NOT NULL, 
    INDEX 'idxOrder' (orderID),
    CONSTRAINT 'fkOrderID'
    FOREIGN KEY (orderID)
    
    REFERENCES food_order(orderID) ON UPDATE CASCADE ON DELETE RESTRICT
 )ENGINE=INNODB;
 
                        
                        
insert into sonoo.users values (123, 456);
insert into sonoo.users values (1, 6);
insert into sonoo.users values (2, 6);
insert into sonoo.users values (3, 6);
