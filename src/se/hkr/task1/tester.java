package se.hkr.task1;


import java.lang.reflect.Array;

public class tester extends Employee{
    private String[] tools;
    public tester(int id, String name, String dept, Double salary, String[] tools) {
        super(id, name, dept, salary);
        this.tools = tools;
    }

    String[] gettools() {
        return tools;
    }
    void settools(){}

    @Override
    void work(){
        super.work();
        System.out.println("Tester is testing: ");
        int nr = 0;
        for(String n: tools) {
            nr++;
            System.out.println(nr + ") " + n);
        }
    }

}
