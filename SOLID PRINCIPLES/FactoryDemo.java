// Step 1: Create an interface
interface Shape {
    void draw();
}

// Step 2: Create concrete classes implementing the same interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Create a Factory to generate object of concrete class
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}

// Step 4: Use the Factory in your main class
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("CIRCLE");
        s1.draw(); // Drawing a Circle

        Shape s2 = factory.getShape("RECTANGLE");
        s2.draw(); // Drawing a Rectangle.
    }
}
