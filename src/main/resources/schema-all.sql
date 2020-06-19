DROP TABLE accounts IF EXISTS;

CREATE TABLE accounts  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    account_number INT
);