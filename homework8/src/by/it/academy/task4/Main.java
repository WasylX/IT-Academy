package by.it.academy.task4;

public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();

        Shape triangle = new Triangle("Красный", "Бумага", 5, 7);
        Shape square = new Square("Синий", "Пленка", 4);
        Shape circle = new Circle("Желтый", "Пластик", 3);
        Shape rectangle = new Rectangle("Зеленый", "Бумага", 6, 8);
        Shape sameShape1 = new Circle("Желтый", "Пластик", 2);
        Shape sameShape2 = new Square("Синий", "Пленка", 5);

        magicBox.addShape(triangle);
        magicBox.addShape(square);
        magicBox.addShape(circle);
        magicBox.addShape(rectangle);
        magicBox.addShape(sameShape1);
        magicBox.addShape(sameShape2);

        System.out.println("Фигуры в коробке:");
        magicBox.displayAllShapes();
        System.out.println("---------------------------------");

        double totalPerimeter = magicBox.calculateTotalPerimeter();
        double totalArea = magicBox.calculateTotalArea();
        System.out.println("Общая площадь всех фигур в коробке: " + totalArea + "\n"
                + "Общий периметр всех фигур в коробке: " + totalPerimeter );
        System.out.println("---------------------------------");

        System.out.println("Фигуры с одинаковым цветом, формой и материалом:");
        magicBox.findSimilarShapes();
        System.out.println("---------------------------------");

        SpareForm spareForm = new SpareForm("Красный", "Бумага", 1);
        magicBox.cutShapeAndAdd(triangle, spareForm, "Circle");

        System.out.println("Обновленный список фигур в коробке :");
        magicBox.displayAllShapes();
    }
}

