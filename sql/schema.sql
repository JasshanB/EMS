-- Create Employee Management System database
CREATE DATABASE ems;

USE ems;

-- Employee table
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE
);

-- Department table
CREATE TABLE departments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL
);

-- Sample data
INSERT INTO departments (dept_name) VALUES ('HR'), ('Engineering'), ('Finance');
INSERT INTO employees (name, email, department, salary, hire_date)
VALUES ('Alice', 'alice@example.com', 'HR', 50000.00, '2023-05-12');
