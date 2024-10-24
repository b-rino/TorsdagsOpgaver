package Torsdagsopgaver6.TaskFour;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10,20);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShapes(circle);
        shapeBuilder.addShapes(square);
        System.out.println(shapeBuilder.getTotalArea());
    }
}
