package Es_01;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);

        circle.draw();
        rectangle.draw();
    }
}
