package Torsdagsopgaver6.TaskFour;

public class Square implements Shape {

    private double length;
    private double height;

    public Square(double l, double h){
        this.length = l;
        this.height = h;
    }

    public double getArea() {
        return length * height;
    }
}
