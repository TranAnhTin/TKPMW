package Creational.Factory.A3;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());
        System.out.println(rectangle.toString());
    }
}
