package by.it.academy.task4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, String material, double base, double height) {
        super(color, material, "Треугольник");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // Для упрощения, предположим, что треугольник равнобедренный
        return 2 * (base + Math.sqrt((base * base) / 4 + height * height));
    }
}

