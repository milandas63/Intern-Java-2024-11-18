DROP DATABASE IF EXISTS test_assessment;
CREATE DATABASE IF NOT EXISTS test_assessment;
USE test_assessment;


###################
###   SUBJECT   ###
###################
SELECT 'subject';
CREATE TABLE subject(
    sub_id			INT(6)			NOT NULL AUTO_INCREMENT,
    sub_desc		VARCHAR(100)	NOT NULL UNIQUE,
    sub_abbr        VARCHAR(10)		DEFAULT NULL,
    PRIMARY KEY(sub_id)
);
INSERT INTO subject VALUES
    (1,   "HTML",          "HTM" ),
    (2,   "CSS",           "CSS" ),
    (3,   "JavaScript",    "JAV" ),
    (4,   "Core Java",     "COR" ),
    (5,   "Advanced Java", "ADV" ),
    (6,   "Angular",       "ANG" ),
    (7,   "Spring",        "SPR" ),
    (8,   "Spring Boot",   "SPR" ),
    (9,   "GitHub",        "GIT" );


##################
###   FORMAT   ###
##################
SELECT 'format';
CREATE TABLE format(
   for_id               INT(6)                 NOT NULL AUTO_INCREMENT,
   for_desc             VARCHAR(100)           NOT NULL UNIQUE,
   for_abbr             VARCHAR(10)            DEFAULT NULL,
   PRIMARY KEY(for_id)
);
INSERT INTO format VALUES
    (1,  "Multiple Choice",              "MC"  ),
    (2,  "True/False",                   "TF"  ),
    (3,  "Fill-in-the-Blanks",           "FIB" ),
    (4,  "Fill-in-Multiple-Blanks",      "FIMB"),
    (5,  "Muiltiple Answers",            "MA"  ),
    (6,  "Multiple Drop-down",           "MDD" ),
    (7,  "Matching",                     "MAT" ),
    (8,  "Numerical Answer",             "NA"  ),
    (9,  "Formula",                      "FOR" ),
    (10, "Essay or Descriptive Answer",  "EDA" ),
    (11, "File Upload",                  "FU"  );


#################
###   LEVEL   ###
#################
SELECT 'level';
CREATE TABLE level(
	lev_id              INT(6)                 NOT NULL AUTO_INCREMENT,
	lev_desc            VARCHAR(100)           NOT NULL UNIQUE,
	lev_abbr            VARCHAR(10)            DEFAULT NULL,
	PRIMARY KEY(lev_id)
);
INSERT INTO level VALUES
    (1,   "Easy",            "EAS" ),
    (2,   "Medium",          "MED" ),
    (3,   "Difficult",       "DIF" ),
    (4,   "Very difficult",  "VD"  );


###################
###   MARKING   ###
###################
SELECT 'marking';
CREATE TABLE marking(
	mark_id                 INT(6)					NOT NULL AUTO_INCREMENT,
	mark_desc               VARCHAR(100)			NOT NULL UNIQUE,
	mark_abbr               VARCHAR(10)				DEFAULT NULL,
	PRIMARY KEY(mark_id)
);
INSERT INTO marking VALUES
    (1, "Minus marking",  "MIM" ),
    (2, "Full mark",      "FM"  ),
    (3, "Bonus mark",     "BM"  );


#######################
###   QUESTION-01   ###
#######################
SELECT 'question_01';
CREATE TABLE question_01(
	q_id            INT(6)          NOT NULL AUTO_INCREMENT,
	q_text          VARCHAR(200)    NOT NULL UNIQUE,
	q_choice1       VARCHAR(100)    NOT NULL,
	q_answer1       ENUM('Y')       DEFAULT NULL,
	q_choice2       VARCHAR(100)    NOT NULL,
	q_answer2       ENUM('Y')       DEFAULT NULL,
	q_choice3       VARCHAR(100)    NOT NULL,
	q_answer3       ENUM('Y')       DEFAULT NULL,
	q_choice4       VARCHAR(100)    NOT NULL,
	q_answer4       ENUM('Y')       DEFAULT NULL,
	q_sub_id        INT(6)          NOT NULL REFERENCES subject(sub_id),
	q_format_id     INT(6)          NOT NULL REFERENCES format(for_id),
	q_level_id      INT(6)          NOT NULL REFERENCES level(lev_id),
	q_marking_id    INT(6)          NOT NULL REFERENCES marking(mark_id),
	q_mark          INT(3)          NOT NULL,
	PRIMARY KEY(q_id)
);
INSERT INTO question_01 VALUES
	(1, "Who is known as the father of Java programming language", "James Gosling", "Y", "M P Java", NULL, "Charles Bobbage", NULL, "Blais Pascal", NULL, 4, 1, 1, 1, 1),












