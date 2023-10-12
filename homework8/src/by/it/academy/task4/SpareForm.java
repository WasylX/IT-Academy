package by.it.academy.task4;

public class SpareForm {
    private String color;
    private String material;
    private double parameter;

    public SpareForm(String color, String material, double parameter) {
        this.color = color;
        this.material = material;
        this.parameter = parameter;
    }

    public Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "Triangle" -> new Triangle(color, material, parameter, parameter);
            case "Circle" -> new Circle(color, material, parameter);
            case "Square" -> new Square(color, material, parameter);
            case "Rectangle" -> new Rectangle(color, material, parameter, parameter);
            default -> null;
        };
    }
}

