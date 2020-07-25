DROP TABLE IF EXISTS ISSUESLISTS;
CREATE TABLE ISSUESLISTS
(
ID SERIAL PRIMARY KEY,
NAME VARCHAR(100)
);
SELECT * FROM issueslists;

INSERT INTO issueslists (NAME)
VALUES ("To Do");

INSERT INTO issueslists (NAME)
VALUES ("In progress");

INSERT INTO issueslists (NAME)
VALUES ("Done");

COMMIT;
SELECT * FROM issueslists;

DROP TABLE IF EXISTS ISSUES;
CREATE TABLE ISSUES
(
ID SERIAL PRIMARY KEY,
ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID),
SUMMARY VARCHAR(1024),
DESCRIPTION VARCHAR(1024),
USER_ID_ASSIGNEDTO BIGINT UNSIGNED NOT NULL,
FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS(ID)
);

COMMIT;
SELECT * FROM ISSUES;

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Go to the doctor.", "Go to the doctor on Monday.", 1);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Go to the shopping.", "Go to the shopping every Friday.", 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Clean up bathroom.", "Clean up bathroom immediatelly.", 4);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Read a book.", "Read a book every day for 30 minutes.", 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Take a shower", "Take a shower before sleeping.", 1);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Learn the programming", "Learn the programing every day.", 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Make fit", "Loose my weight", 4);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Cooking dinner", "Cooking dinner for family.", 5);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Watch the film", "Watch the last period.", 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (2, "Learn the English", "Learn English every day.", 4);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Clean up a car.", "Clean up a car every week.", 1);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Cut hair.", "Cut hair for children.", 4);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Build a house.", "Build a house for my family.", 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Buy new dress.", "Buy new dress for daughter", 5);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (3, "Do exercises.", "Do exercises from course.", 1);

COMMIT;

SELECT * FROM ISSUES;

SELECT * FROM issueslists;