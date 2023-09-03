public class Task3 {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        boolean isTriangle = isTrianglePossible(side1, side2, side3);

        if (isTriangle) {
            System.out.println("Из этих отрезков можно образовать треугольник.");
        } else {
            System.out.println("Из этих отрезков нельзя образовать треугольник.");
        }
    }

        public static boolean isTrianglePossible ( double side1, double side2, double side3){
            return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        }
}

