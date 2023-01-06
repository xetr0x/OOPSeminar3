package se.hkr.task2;
import java.io.Serializable;
import java.lang.Comparable;
public class Comptetitor implements Serializable, Comparable<Comptetitor>{
//TODO: What the hell does serialization do?
    //private static final long serialVersionUID = 1L; can be not needed code!!
    private String name;
    private int age;
    private String gender;
    private Time time;


    public Comptetitor(String name, int age, String gender, Time time){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.time = time;
    }
//TODO: understand format of time, converting everything to seconds and make a comparable method.
    public int compareTo(Comptetitor another) {
        int thistime = this.time.gethours()*3600 + this.time.getminutes()*60 + this.time.getseconds();
        int comparetime = another.time.gethours()*3600 + another.time.getminutes()*60 + another.time.getseconds();
        if(thistime >= comparetime){
            return 1;
        }else{
        return -1;
    }}
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d --> %s",time.gethours(), time.getminutes(), time.getseconds(),name);
    }
}
