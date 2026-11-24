//-----------------------Zad 13-----------------------

class Shape {
    public double area() {
        return 0.0;
    }

    public String getName() {
        return "Figura";
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Kolo";
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Prostokat";
    }
}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String getName() {
        return "Trojkat";
    }
}

public class Zadanie13_Figury {

    public static void printShape(Shape shape) {
        System.out.println(shape.getName() + " - pole: " + shape.area());
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new Triangle(6, 2)
        };

        for (Shape shape : shapes) {
            printShape(shape);
        }
    }
}
