package se.hkr.task2;
import java.io.Serializable;
public class Comptetitor implements Serializable, Comparable<int>{

    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String gender;
    Time time;


    public Comptetitor(String name, int age, String gender, Time time){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.time = time;
    }
}
