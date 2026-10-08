-- Day 1: PostgreSQL Basics

-- Basic calculation
SELECT 2 + 3;

-- Create students table
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    email VARCHAR(150)
);

-- Insert a student
INSERT INTO students (name, age, email)
VALUES ('Janavi', 22, 'janavi@example.com');

-- Display all students
SELECT * FROM students;