package Torsdagsopgaver6.TaskThree;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> passedCourses = new ArrayList<String>();
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        }
        else{
            currentCourses.add(course);
        }
        return true;
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }
}
