public class Task9 {
    public static void main(String[] args) {
        double x = 1.0;
        double epsilon = 0.0000001;
        double result = 1.0;

        double term = 1.0;
        int n = 1;
        while (Math.abs(term) > epsilon) {
            term *= x / n;
            result += term;
            n++;
        }

        System.out.printf("Значение экспоненты с точностью до %.7f: %.7f%n", epsilon, result);

    }
}

