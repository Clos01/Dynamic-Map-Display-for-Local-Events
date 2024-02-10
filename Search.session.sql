CREATE TABLE test_table(
    sometext VARCHAR(100)
);
INSERT INTO test_table(sometext)
values('abc');
INSERT INTO test_table (sometext) 

VALUES ('sometext:varchar');
INSERT INTO test_table(sometext)
values('def');

INSERT INTO test_table (sometext)
VALUES ('sometext:varchar');

SELECT sometext
FROM test_table;