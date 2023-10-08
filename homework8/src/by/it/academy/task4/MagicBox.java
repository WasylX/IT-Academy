package by.it.academy.task4;

public class MagicBox {
    private Shape[] shapes;
    private int size;

    public MagicBox() {
        shapes = new Shape[100];
        size = 0;
    }

    public void addShape(Shape shape) {
        if (size < 100) {
            shapes[size] = shape;
            size++;
        } else {
            System.out.println("Магическая коробка полна. Нельзя добавить больше фигур.");
        }
    }

    public void displayAllShapes() {
        for (int i = 0; i < size; i++) {
            if (shapes[i] != null) {
                System.out.println("Фигура: " + shapes[i].getForm() + ", Цвет: " + shapes[i].getColor()
                        + ", Материал: " + shapes[i].getMaterial());
            }
        }
    }

    public double calculateTotalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < size; i++) {
            if (shapes[i] != null) {
                totalPerimeter += shapes[i].calculatePerimeter();
            }
        }
        return totalPerimeter;
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < size; i++) {
            if (shapes[i] != null) {
                totalArea += shapes[i].calculateArea();
            }
        }
        return totalArea;
    }

    public void findSimilarShapes() {
        for (int i = 0; i < size - 1; i++) {
            if (shapes[i] != null) {
                for (int j = i + 1; j < size; j++) {
                    if (shapes[j] != null && shapes[i].getClass() == shapes[j].getClass()
                            && shapes[i].getColor().equals(shapes[j].getColor())
                            && shapes[i].getMaterial().equals(shapes[j].getMaterial())) {
                        System.out.println("Фигура 1: " + shapes[i].getForm() + ", Цвет: " + shapes[i].getColor()
                                + ", Материал: " + shapes[i].getMaterial());
                        System.out.println("Фигура 2: " + shapes[j].getForm() + ", Цвет: " + shapes[j].getColor()
                                + ", Материал: " + shapes[j].getMaterial());
                    }
                }
            }
        }
    }

    public void cutShapeAndAdd(Shape target, SpareForm spareForm, String shapeType) {
        boolean targetFound = false;

        for (int i = 0; i < size; i++) {
            if (shapes[i] == target) {
                targetFound = true;

                if (target != null) {
                    shapes[i] = null;

                    Shape newShape = spareForm.createShape(shapeType);
                    newShape.setColor(target.getColor());
                    newShape.setMaterial(target.getMaterial());
                    addShape(newShape);

                    System.out.println("Фигура успешно вырезана и добавлена в коробку.");
                    System.out.println("---------------------------------");
                } else {
                    System.out.println("Целевая фигура пуста.");
                    System.out.println("---------------------------------");
                }
            }
        }

        if (!targetFound) {
            System.out.println("Целевая фигура не найдена в коробке.");
            System.out.println("---------------------------------");
        }
    }
}

