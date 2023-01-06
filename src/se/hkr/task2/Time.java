package se.hkr.task2;

import java.io.Serializable;

public class Time implements Serializable {


    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    int gethours(){
        return hours;
    }
    void setHours(int hours){this.hours = hours;}
    int getminutes(){
        return minutes;
    }
    void setMinutes(int minutes){this.minutes = minutes;}
    int getseconds(){
        return seconds;
    }
    void setSeconds(int seconds){this.seconds = seconds;}
}
