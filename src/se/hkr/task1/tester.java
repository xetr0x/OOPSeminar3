package se.hkr.task1;


import java.lang.reflect.Array;

public class tester extends employee{
    String[] tools;
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
        System.out.println("Tester is testing: ");
        System.out.println("1) Selenium");
        System.out.println("2) Testingwhiz");
        System.out.println("3) Ranorex");
    }
}
