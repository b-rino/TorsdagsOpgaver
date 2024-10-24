package Torsdagsopgaver6.TaskFour;

public class Circle implements Shape {

    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double getArea(){
        return (radius * radius) * Math.PI;
    }
}
