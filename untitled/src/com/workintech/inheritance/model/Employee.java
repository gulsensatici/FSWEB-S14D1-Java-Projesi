package com.workintech.inheritance.model;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {

        return salary;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(int salary) {

        this.salary=salary<0 ? 0 : salary;
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee starts to working");
    }
}
