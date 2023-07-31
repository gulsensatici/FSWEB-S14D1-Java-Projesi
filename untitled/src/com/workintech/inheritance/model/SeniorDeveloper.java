package com.workintech.inheritance.model;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        setSalary(45000);
        System.out.println(getName()+"senior developer begins to working");
    }
}
