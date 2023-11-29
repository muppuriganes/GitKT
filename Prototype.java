import java.util.HashMap;
import java.util.Map;

// Prototype interface
interface Shape {
    Shape clone();
    void draw();
}
// Concrete prototype classes
class Circle implements Shape {
    String type;

    public Circle() {
        this.type = "Circle";
    }
    @Override
    public Shape clone() {
        return new Circle();
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square implements Shape {
    String type;

    public Square() {
        this.type = "Square";
    }
    @Override
    public Shape clone() {
        return new Square(); }
    @Override
    public void draw() {
        System.out.println("Drawing Square");}
}
class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type) {
        Shape cachedShape = shapeMap.get(type);
        return (Shape) cachedShape.clone();}
    public static void loadCache() {
        Circle circle = new Circle();
        Square square = new Square();

        shapeMap.put(circle.type, circle);
        shapeMap.put(square.type, square);}}
public class Prototype {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedCircle = ShapeCache.getShape("Circle");
        Shape clonedSquare = ShapeCache.getShape("Square");
        clonedCircle.draw();
        clonedSquare.draw();}}
