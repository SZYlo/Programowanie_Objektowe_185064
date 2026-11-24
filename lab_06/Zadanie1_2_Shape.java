// Zadanie 1 i 2: Klasa abstrakcyjna Shape ze stanem prywatnym name
abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("1. Konstruktor klasy abstrakcyjnej Shape: " + name);
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public void printInformation() {
        System.out.println("Figura: " + getName() + ", pole: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Kolo");
        this.radius = radius;
        System.out.println("2. Konstruktor klasy Circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Prostokat");
        this.width = width;
        this.height = height;
        System.out.println("2. Konstruktor klasy Rectangle");
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Trojkat");
        this.base = base;
        this.height = height;
        System.out.println("2. Konstruktor klasy Triangle");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Zadanie1_2_Shape {
    public static void main(String[] args) {
        // Najpierw wywoluje sie konstruktor klasy bazowej Shape, potem klasy pochodnej
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new Triangle(6, 2)
        };

        System.out.println("--- Informacje o figurach ---");
        for (Shape shape : shapes) {
            shape.printInformation();
        }
    }
}
