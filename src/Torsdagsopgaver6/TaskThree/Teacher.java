package Torsdagsopgaver6.TaskThree;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> canTeach = new ArrayList<String>();
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;

    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }

    public ArrayList<String> getCanTeach() {
        return canTeach;
    }
}
