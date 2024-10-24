package Torsdagsopgaver6.TaskFour;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape>  shapes =  new ArrayList<>();

    public void addShapes(Shape s ) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        return total;
    }
}
