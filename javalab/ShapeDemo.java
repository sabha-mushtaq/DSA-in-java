

import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("\nCircle");
        System.out.println("Area = " + c.calculateArea());
        System.out.println("Perimeter = " + c.calculatePerimeter());

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        Rectangle r = new Rectangle(length, width);

        System.out.println("\nRectangle");
        System.out.println("Area = " + r.calculateArea());
        System.out.println("Perimeter = " + r.calculatePerimeter());

        sc.close();
    }
}