package se.hkr.task1;

import java.lang.reflect.Array;

public class manager extends employee{
    String[] Projects;
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
        System.out.println("Manager is managing");
        for(i : Projects)
        System.out.println(") "+ Projects);
    }

}
