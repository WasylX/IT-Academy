public class Task6 {
        public static void main(String[] args) {
            double a = 4.0;
            double b = 3.0;
            double c = 1.0;

            double discriminant = b * b - 4 * a * c;

            if (a == 0) {
                System.out.println("Это не квадратное уравнение (a = 0).");
            } else if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("У уравнения два корня:");
                System.out.println("Корень 1: " + root1);
                System.out.println("Корень 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("У уравнения один корень:");
                System.out.println("Корень: " + root);
            } else if (a == 0 && b == 0 && c == 0) {
                System.out.println("Уравнение имеет бесконечно много корней.");
            } else {
                System.out.println("У уравнения нет действительных корней.");
            }
        }
    }

