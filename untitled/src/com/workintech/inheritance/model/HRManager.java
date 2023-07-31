package com.workintech.inheritance.model;

public class HRManager extends Employee{
    private JuniorDeveloper[] JuniorDevelopers;
    private SeniorDeveloper[] MidDevelopers;
    private SeniorDeveloper[] SeniorDevelopers;
    public HRManager(long id, String name, double salary, JuniorDeveloper[] JuniorDevelopers,
                     SeniorDeveloper[] MidDevelopers, SeniorDeveloper[] SeniorDevelopers) {

        super(id, name, salary);
        this.JuniorDevelopers=JuniorDevelopers;
        this.MidDevelopers=MidDevelopers;
        this.SeniorDevelopers=SeniorDevelopers;
    }
    public void addEmployee(int index, JuniorDeveloper developer){
        try {
            if(JuniorDevelopers[index]==null){
                JuniorDevelopers[index]=developer;
            }else {
                System.out.println("index is full");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("index not found"+ ex.getMessage());
        }

    }
    public void addEmployee(int index, SeniorDeveloper developer){
        try {
            if(MidDevelopers[index]==null){
                MidDevelopers[index]=developer;
            }else {
                System.out.println("index is full");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("index not found"+ ex.getMessage());
        }

    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return JuniorDevelopers;
    }

    public SeniorDeveloper[] getMidDevelopers() {
        return MidDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return SeniorDevelopers;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName()+"HR manager begins to working");
    }
}
