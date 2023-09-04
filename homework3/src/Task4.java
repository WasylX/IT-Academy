public class Task4 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double x = 4;

        if (x > a && x < b) {
            double distanceToA = Math.abs(x - a);
            double distanceToB = Math.abs(x - b);
            System.out.println("Точка x находится внутри отрезка.");
            System.out.println("Расстояние до точки a: " + distanceToA);
            System.out.println("Расстояние до точки b: " + distanceToB);
        } else if (x == a) {
            System.out.println("Точка x совпадает с начальной точкой отрезка a.");
            System.out.println("Длина отрезка: " + (b - a));
        } else if (x == b) {
            System.out.println("Точка x совпадает с конечной точкой отрезка b.");
            System.out.println("Длина отрезка: " + (b - a));
        } else {
            double distanceToA = Math.abs(x - a);
            double distanceToB = Math.abs(x - b);
            String nearestPoint = (distanceToA < distanceToB) ? "a" : "b";
            double nearestDistance = Math.min(distanceToA, distanceToB);
            System.out.println("Точка x не принадлежит отрезку.");
            System.out.println("Ближайшая точка: " + nearestPoint);
            System.out.println("Расстояние до ближайшей точки: " + nearestDistance);
        }
    }
}

