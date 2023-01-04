package se.hkr.task1;

public abstract class Employee {

    private int id;
    private String name;
    private String dept;
    private Double salary;
    public Employee(int id, String name, String dept, Double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;

    }
    void work() {
        System.out.println("Common work for everyone!");
    }
    int getid(){
        return id;
    }
    void setid(int newid){
        id = newid;
    }
    String getname(){
        return name;
    }
    void setname(){}

    String getdept(){
        return dept;
    }
    void setdept(){}
    Double getsalary(){
        return salary;
    }
    void setsalary(){}


    abstract void name();
}

