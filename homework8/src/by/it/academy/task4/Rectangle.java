package by.it.academy.task4;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String material, double length, double width) {
        super(color, material, "Прямоугольник");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

