package se.hkr.task1;

import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {
        String[] TheProjects = {"PPG Signal", "Thorax Signal"};
        employee Manager = new manager(1, "John", "R&D", 100000.0, TheProjects);
        String[] Tools = {"Selenium", "Testingwhiz", "Ranorex"};
        employee Tester = new tester(2, "Anna", "R&D", 80000.0, Tools);
        String Technology = "Developer is developing Machine Learning Algorithm";
        employee Developer = new developer(3, "Rickard", "R&D", 10.0, Technology);
    }
}
