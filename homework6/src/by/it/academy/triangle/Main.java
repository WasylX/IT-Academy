package by.it.academy.triangle;

class Main {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(3, 3, 3),    // Равносторонний
                new Triangle(4, 4, 3),    // Равнобедренный
                new Triangle(3, 4, 5),    // Прямоугольный
                new Triangle(5, 6, 7),    // Произвольный
                new Triangle(6, 6, 6),    // Равносторонний
                new Triangle(5, 12, 13),  // Прямоугольный
                new Triangle(8, 15, 17)   // Прямоугольный
        };

        String[] types = {"Равносторонний", "Равнобедренный", "Прямоугольный", "Произвольный"};

        double[] minArea = new double[types.length];
        double[] maxArea = new double[types.length];
        double[] minPerimeter = new double[types.length];
        double[] maxPerimeter = new double[types.length];

        for (int i = 0; i < types.length; i++) {
            minArea[i] = Double.MAX_VALUE;
            maxArea[i] = Double.MIN_VALUE;
            minPerimeter[i] = Double.MAX_VALUE;
            maxPerimeter[i] = Double.MIN_VALUE;
        }

        int[] counts = new int[types.length];

        for (Triangle triangle : triangles) {
            double area = triangle.getArea();
            double perimeter = triangle.getPerimeter();
            String type = triangle.getType();

            for (int i = 0; i < types.length; i++) {
                if (type.equals(types[i])) {
                    minArea[i] = Math.min(minArea[i], area);
                    maxArea[i] = Math.max(maxArea[i], area);
                    minPerimeter[i] = Math.min(minPerimeter[i], perimeter);
                    maxPerimeter[i] = Math.max(maxPerimeter[i], perimeter);
                    counts[i]++;
                }
            }

            System.out.println(type + " треугольник:");
            System.out.println("Площадь: " + area);
            System.out.println("Периметр: " + perimeter);
            System.out.println("--------");
        }

        for (int i = 0; i < types.length; i++) {
            System.out.println("Количество " + types[i] + " треугольников: " + counts[i]);
            System.out.println("Наименьшая площадь " + types[i] + ": " + minArea[i]);
            System.out.println("Наибольшая площадь " + types[i] + ": " + maxArea[i]);
            System.out.println("Наименьший периметр " + types[i] + ": " + minPerimeter[i]);
            System.out.println("Наибольший периметр " + types[i] + ": " + maxPerimeter[i]);
            System.out.println();
        }
    }
}

