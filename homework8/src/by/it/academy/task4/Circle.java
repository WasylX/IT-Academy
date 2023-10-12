package by.it.academy.task4;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, String material, double radius) {
        super(color, material, "Круг");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

