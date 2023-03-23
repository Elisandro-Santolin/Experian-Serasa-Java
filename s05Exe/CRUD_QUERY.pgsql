-- -- Tabela Estudantes
-- DROP TABLE IF EXISTS STUDENTS;
-- CREATE TABLE STUDENTS(
--    STUDENT_ID INT PRIMARY KEY     NOT NULL,
--    NAME           TEXT            NOT NULL,
--    AGE            INT             NOT NULL,
--    CITY           CHAR(50)        NOT NULL,
--    LUCK_NUMBER    INT             NOT NULL
-- );
 
-- INSERT INTO STUDENTS VALUES (1,  'Ericsson Almeida Beserra',             32, 'Wichita',           787 );
-- INSERT INTO STUDENTS VALUES (2,  'Guilherme Oliveira',                   26, 'Caxias do Sul',     235 );
-- INSERT INTO STUDENTS VALUES (3,  'Gabriel Pires Bonagio',                26, 'Juiz de Fora',       42 );
-- INSERT INTO STUDENTS VALUES (4,  'Leandro de Oliveira',                  31, 'Cidade de Palhoça', 666 );
-- INSERT INTO STUDENTS VALUES (5,  'Lucas da Silva Aureliano',             32, 'Omaha',             636 );
-- INSERT INTO STUDENTS VALUES (6,  'Marcos Antônio Alves',                 32, 'Washington',        243 );
-- INSERT INTO STUDENTS VALUES (7,  'Helido Pereira Cauquine Junior',       32, 'Spokane',            45 );
-- INSERT INTO STUDENTS VALUES (8,  'Elisandro Luiz Santolin',              27, 'Anchorage',         487 );
-- INSERT INTO STUDENTS VALUES (9,  'Ederson Ramos Bononi',                 24, 'Grand Prairie',     112 );
-- INSERT INTO STUDENTS VALUES (10, 'Douglas Da Cunha Sobrinho',            51, 'San Antonio',       787 );
-- INSERT INTO STUDENTS VALUES (11, 'Ciraiane Alves Aguiar',                92, 'New Orleans',       424 );
-- INSERT INTO STUDENTS VALUES (12, 'Adriane Lopes da Silva',               15, 'Cedar Falls',        43 );
-- INSERT INTO STUDENTS VALUES (13, 'Luciana Rodrigues Vieira Tavares',     32, 'Stamford',          234 );
-- INSERT INTO STUDENTS VALUES (14, 'Leonardo Duarte Bernardes',            32, 'Springfield',        26 );
-- INSERT INTO STUDENTS VALUES (15, 'Jose Eusimar de Queiroz',              37, 'Barrocas',           25 );
-- INSERT INTO STUDENTS VALUES (16, 'Bruno Souza Santana Cavalcante Dias',  78, 'California',        486 );
-- INSERT INTO STUDENTS VALUES (17, 'Alex Santos de Oliveira',              45, 'Portland',            4 );
-- INSERT INTO STUDENTS VALUES (18, 'Alexsandro de Souza Araujo',           34, 'Columbia',           84 );
-- INSERT INTO STUDENTS VALUES (19, 'Flávio Sant''ana De Souza',            32, 'Nashua',             45 );



-- UPDATE students
-- SET age = '25'
--     WHERE student_id = 11;
    
-- SELECT * FROM students
--     ORDER BY student_id;

-- SELECT * FROM students
--     WHERE name LIKE '%S___a%'
--     AND age >= 32;

-- SELECT * FROM students LIMIT 10 OFFSET 10;

-- SELECT * FROM students
--     ORDER BY age, name ASC;

-- SELECT city, * FROM students 
--     WHERE age = 32
--     ORDER BY name LIMIT 5;

-- SELECT *, age + luck_number AS my_column FROM students
    -- ORDER BY my_column ASC;
