package com.deitel.exercicios.Capitulo23.Cap23_17;

public class Employee {

    private final String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        if (!name.matches("[A-Z][A-Za-z]+|[A-Z][A-Za-z]+\\s[A-Z][A-Za-z]+")) {
            throw new IllegalArgumentException("Invalid name.");
        }

        this.name = name;

        setDepartment(department);
        setSalary(salary);
    }

    public void setDepartment(String department) {
        if (!department.matches("[A-Z][A-Za-z]+")) {
            throw new IllegalArgumentException("Invalid department.");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Invalid salary.");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-16s%-12.2f%s", getName(), getSalary(), getDepartment());
    }
}
