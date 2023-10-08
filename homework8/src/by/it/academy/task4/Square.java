package by.it.academy.task4;

public class Square extends Shape {
    private double side;

    public Square(String color, String material, double side) {
        super(color, material, "Квадрат");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

