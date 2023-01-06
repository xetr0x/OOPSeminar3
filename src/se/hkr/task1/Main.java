package se.hkr.task1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        String[] TheProjects = {"PPG Signal", "Thorax Signal"};
        Employee Manager = new manager(1, "John", "R&D", 100000.0, TheProjects);
        String[] Tools = {"Selenium", "Testingwhiz", "Ranorex"};
        Employee Tester = new tester(2, "Anna", "R&D", 80000.0, Tools);
        String Technology = "Quantum Computer Algorithms";
        Employee Developer = new developer(3, "Rickard", "R&D", 10.0, Technology);
        ArrayList<Employee> employee = new ArrayList<Employee>();
        employee.add(Manager);
        employee.add(Tester);
        employee.add(Developer);
        d.printEmployees(employee);
    }

    void printEmployees(ArrayList<Employee> employee){
        for (Employee Employ: employee){
            //if (Employ = manager)
            //Employ.work();

        }

    }

}
