USE java18;

CREATE TABLE students(
	pid			INT(6)			NOT NULL AUTO_INCREMENT,
	name		VARCHAR(30)		NOT NULL,
	father		VARCHAR(30),
	mobile		VARCHAR(12),
	email		VARCHAR(30),
	PRIMARY KEY(pid)
);
