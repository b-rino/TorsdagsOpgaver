package Torsdagsopgaver6.TaskThree;

public abstract class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.length()>0)
        this.name = name;
        else System.out.println("Try again!");
    }

    public abstract boolean addCourse(String course);
}
