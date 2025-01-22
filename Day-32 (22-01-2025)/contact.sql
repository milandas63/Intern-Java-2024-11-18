DROP DATABASE IF EXISTS contact18;
CREATE DATABASE IF NOT EXISTS contact18;
USE contact18;

# Relation
CREATE TABLE relation(
	rel_id      INT(6)			NOT NULL AUTO_INCREMENT,
	rel_desc    VARCHAR(20)		NOT NULL UNIQUE,
	rel_abbr    VARCHAR(10),
	PRIMARY KEY(rel_id)
);
INSERT INTO relation VALUES
	(1, "Family", NULL),
	(2, "Cousins", NULL),
	(3, "Students", NULL),
	(4, "School Friends", NULL),
	(5, "Professional Friends", NULL),
	(6, "Teacher", NULL);


# Location
CREATE TABLE location(
	loc_id		INT(6)			NOT NULL AUTO_INCREMENT,
	loc_desc    VARCHAR(20)     NOT NULL UNIQUE,
	loc_abbr    VARCHAR(10),
	PRIMARY KEY(loc_id)
);
INSERT INTO location VALUES
	(1, "Bhubaneswar", "BBSR"),
	(2, "Cuttack", "CTC"),
	(3, "Khurda", "KHR"),
	(4, "Berhampur", "BAM"),
	(5, "United States", "US");


# Contact
CREATE TABLE contact(
	con_id		INT(6)			NOT NULL AUTO_INCREMENT,
	con_name    VARCHAR(30)		NOT NULL,
	mobile_no1  VARCHAR(12)     NOT NULL,
	mobile_no2  VARCHAR(12),
	email_id    VARCHAR(30),
	address     VARCHAR(100),
	rel_id      INT(6)          NOT NULL REFERENCES relation(rel_id),
	loc_id      INT(6)          NOT NULL REFERENCES location(loc_id),
	PRIMARY KEY(con_id)
);
INSERT INTO contact VALUES
	(1, "Milan Das", "7978168568", "9778911223", "milandas63@gmail.com", "VIIM-11, Saileshree Vihar, Bhubaneswar", 6, 1),
	(2, "Sonali Das", "1234567890", "9987654321", "sonalidas@gmail.com", "Bhubaneswar", 3, 1),
	(3, "Suraj Samal", "1234567890", "9987654321", "surajsamal@gmail.com", "Bhubaneswar", 3, 1),
	(4, "Rashmi Ranjan Pradhan", "1234567890", "9987654321", "rashmipradhan@gmail.com", "Bhubaneswar", 3, 1);


# View
SELECT * FROM contact;

SELECT c.con_id, c.con_name, c.mobile_no1, r.rel_desc, l.loc_desc FROM contact AS c
LEFT JOIN relation AS r ON c.rel_id=r.rel_id
LEFT JOIN location AS l ON c.loc_id=l.loc_id;
