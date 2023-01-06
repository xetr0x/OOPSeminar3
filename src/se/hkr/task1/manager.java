package se.hkr.task1;

public class manager extends Employee{
    private String[] Projects;
    public manager(int id, String name, String dept, Double salary, String[] Projects) {
        super(id, name, dept, salary);
        this.Projects = Projects;

    }
    String[] getprojects() {
        return Projects;
    }
    void setprojects(){}

    @Override
    void work(){
        super.work();
        System.out.println("Manager is managing");
        int nr = 0;
        for(String n: Projects) {
            nr++;
            System.out.println(nr + ") " + n);
        }
    }

    }

