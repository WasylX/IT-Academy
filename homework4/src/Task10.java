public class Task10 {
    public static void main(String[] args) {
        System.out.println("Целочисленные точки:");
        findAndPrintIntegerPoints();

        System.out.println("Точки пересечения с осью X (точность 0.00001):");
        findAndPrintRoots(0.00001);

        System.out.println("Точки пересечения с осью X (точность 0.000001):");
        findAndPrintRoots(0.000001);
    }

    public static double f(double x) {
        return 2 * Math.pow(x, 4) + 7 * Math.pow(x, 3) - 3 * Math.pow(x, 2) - 9 * x + 25;
    }

    public static void findAndPrintIntegerPoints() {
        for (int x = -10000; x <= 10000; x++) {
            double y = f(x);
            if (Math.abs(y) <= 10000) {
                System.out.println("Точка: (" + x + ", " + y + ")");
            }
        }
    }

    public static void findAndPrintRoots(double epsilon) {
        int intervals = 100000; // Количество интервалов
        double step = 20000.0 / intervals; // Размер интервала

        for (int i = 0; i < intervals; i++) {
            double x1 = -10000.0 + i * step;
            double x2 = x1 + step;
            double y1 = f(x1);
            double y2 = f(x2);

            if (Math.min(y1, y2) <= 0 && Math.max(y1, y2) >= 0) {
                double root = findRoot(x1, x2, epsilon);
                int decimalPlaces = (epsilon == 0.00001) ? 5 : 6;
                String formattedRoot = String.format("%%.%df".formatted(decimalPlaces), root);
                System.out.println("Точка: (" + formattedRoot + ", 0.0)");
            }
        }
    }

    public static double findRoot(double a, double b, double epsilon) {
        double x = (a + b) / 2;
        while (Math.abs(b - a) >= epsilon) {
            x = (a + b) / 2;
            double y1 = f(x);
            double y2 = f(a);
            if (y1 * y2 < 0) {
                b = x;
            } else {
                a = x;
            }
        }
        return x;
    }
}

