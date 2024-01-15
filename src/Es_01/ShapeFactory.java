package Es_01;

public class ShapeFactory {
    public static Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Tipo di Shape non supportato");
        }
    }
}
