package by.it.academy.triangle;

import java.util.Arrays;

class Triangle {
    private final double[] sides;

    public Triangle(double side1, double side2, double side3) {
        this.sides = new double[]{side1, side2, side3};
        Arrays.sort(sides);
    }

    public double getPerimeter() {
        return Arrays.stream(sides).sum();
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    public String getType() {
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            return "Равносторонний";
        } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
            return "Равнобедренный";
        } else if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            return "Прямоугольный";
        } else {
            return "Произвольный";
        }
    }

    public Triangle[] getSides() {
        return new Triangle[0];
    }
}

