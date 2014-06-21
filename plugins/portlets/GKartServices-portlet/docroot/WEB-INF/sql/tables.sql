create table GKart_GKartCategory (
	catId LONG not null primary key,
	catName VARCHAR(75) null,
	subcatdId INTEGER,
	subcatName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);