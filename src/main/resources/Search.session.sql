-- CREATE TABLE test_table(
--     sometext VARCHAR(100)
-- );
-- INSERT INTO test_table(sometext)
-- values('abc');
-- INSERT INTO test_table (sometext) 

-- VALUES ('sometext:varchar');
-- INSERT INTO test_table(sometext)
-- values('def');

-- INSERT INTO test_table (sometext)
-- VALUES ('sometext:varchar');

-- SELECT sometext
-- FROM test_table;

CREATE DATABASE IF NOT EXISTS restaurant_db;

USE restaurant_db;

CREATE TABLE IF NOT EXISTS restaurant_db (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(255) NOT NULL
); 

INSERT INTO restaurant_db (name) VALUES ('Pizza Place');
INSERT INTO restaurant_db (name) VALUES ('Burger Bahoon');
INSERT INTO restaurant (name) VALUES ('Sushi Sashami');

-- CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
-- GRANT ALL PRIVILEGES ON your_database_name.* TO 'newuser'@'localhost';
-- FLUSH PRIVILEGES;
