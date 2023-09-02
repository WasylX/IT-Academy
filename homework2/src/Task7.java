public class Task7 {
    public static void main(String[] args) {
        double a = 6.0;
        double b = 8.0;
        double r = 5.0;

        boolean canCover = canCoverHole(a, b, r);

        System.out.println("Можно ли закрыть отверстие кругом: " + canCover);
    }

    public static boolean canCoverHole(double a, double b, double r) {

        double diagonal = Math.sqrt(a * a + b * b);

        double diameter = 2 * r;

        // Сравниваем диаметр круга и диагональ отверстия
        return diameter >= diagonal;
    }
}

