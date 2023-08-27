public class TaskOne {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        int sum = x + y;
        int difference = x - y;
        int multiply = x * y;
        int divides = x / y; // Целочисленное деление (Всегда будет 0)

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divides: " + divides);


        double sum1 = x + y;
        double difference1 = x - y;
        double multiply1 = x * y;
        double divides1 = (double) x / y; // Деление Вещественных чисел (С плавающей точкой)

        System.out.println("\n");
        System.out.println("Sum1: " + sum1);
        System.out.println("Difference1: " + difference1);
        System.out.println("Multiply1: " + multiply1);
        System.out.println("Divides1: " + divides1);

    }
}

