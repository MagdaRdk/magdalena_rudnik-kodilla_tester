USE kodilla_tester;
DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS
(
    ID          SERIAL PRIMARY KEY,
    FIRSTNAME   VARCHAR(100),
    LASTNAME    VARCHAR(100)
);

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("John", "Smith");

commit;