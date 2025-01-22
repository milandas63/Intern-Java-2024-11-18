DROP DATABASE IF EXITS contact18;
CREATE DATABASE IF NOT EXITS contact18;
USE contact18;

#Relation
CREATE TABLE relation(
	rel_id INT(6) NOT NULL AUTO_INCREAMENT,
	rel_desc VARCHAR(20) NOT NULL,
	rel_abbr VARCHAR(20),
	PRIMERY KEY(rel_id)
	);
INSERT INTO relation VALUES
	(1, "familly", NULL),
	(2, "Cousion", NULL),
	(3, "Students", NULL),
	(4, "School Friends", NULL),
	(5, "Proffessional Friends", NULL);

#Location
CREATE TABLE location(
	loc_id INT(6) NOT NULL AUTO_INCREAMENT,
	loc_name VARCHAR(20) NOT NULL,
	loc_desc VARCHAR(20),
	loc_abbr VARCHAR(20)
	PRIMERY KEY(loc_id)
	);
INSERT INTO location VALUES
	(1, "Bhubaneswar", NULL, "BBSR"),
	(2, "Cuttack", NULL,"CTC"),
	(3, "Rourkela", NULL, "RKL"),
	(4, "Hydrabad", NULL, "HRD"),
	(5, "Bangalor", NULL, "BGLR");

#Contact
CREATE TABLE contact(
	con_id INT(6) NOT NULL AUTO_INCREAMENT,
	con_name VARCHAR(20) NOT NULL,
	con_email VARCHAR(20) NOT NULL,
	con_mobile BIGINT(10) NOT NULL,
	PRIMERY KEY(con_id)
	);
INSERT INTO contact VALUES
	(1, "Subhasis", "subhasis@gmail.com", 9817458665),
	(2, "Suraj", "suraj@gmail.com", 9938458667),
	(3, "Sonali", "sonali@gmail.com", 6372558662),
	(4, "Rakesh", "rakesh@gmail.com", 8658858665),
	(5, "Rashmi", "rashmi@gmail.com", 6372976078);