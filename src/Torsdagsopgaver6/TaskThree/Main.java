package Torsdagsopgaver6.TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Drama");
        passedCourses1.add("Java 1.0");
        passedCourses1.add("English");

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("Math");
        passedCourses2.add("Science");
        passedCourses2.add("Advanced math");

        ArrayList<String> passedCourses3 = new ArrayList<>();
        passedCourses3.add("Food");
        passedCourses3.add("Java 2.0");
        passedCourses3.add("Math");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("English");
        canTeach1.add("Math");

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Java 1.0");
        canTeach2.add("Math");

        ArrayList<String> canTeach3 = new ArrayList<>();

        canTeach3.add("English");
        canTeach3.add("Java 1.0");
        canTeach3.add("Science");

        ArrayList<Person> persons = new ArrayList<Person>();

        Student s1 = new Student("Benjamin", passedCourses1);
        Student s2 = new Student("Frederik", passedCourses2);
        Student s3 = new Student("Valdemar", passedCourses3);
        Teacher t1 = new Teacher("Signe", canTeach1);
        Teacher t2 = new Teacher("Tine", canTeach2);
        Teacher t3 = new Teacher("Tess", canTeach3);

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        for (Person person : persons) { // foreach loop iterating through persons and checks if the students already have passed the course, and whether the teachers are able to teach the course.
            if (person instanceof Student) {
                Student student = (Student) person; //Type casting to Student to access Student methods
                if (student.getPassedCourses().contains("Java 1.0")){
                    System.out.println(student.getName() + " has already passed the course");
                }
                else{
                    System.out.println(student.getName() + " has not passed the course, but is now added to the course");
                    student.addCourse("Java 1.0"); //adds the course to those students who haven't already completed it
                }
            }
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person; //type casting to Teacher to access Teacher methods
                if(teacher.getCanTeach().contains("Java 1.0")){
                    System.out.println(teacher.getName() + " can teach the course");
                }
                else{
                    System.out.println(teacher.getName() + " cannot teach the course");
                }
            }

        }
        System.out.println(s2.getCurrentCourses()); //to check if the code works properly
    }
}

