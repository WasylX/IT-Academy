public class Task5 {
    public static void main(String[] args) {
        int number = 710;

        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + product);
    }
}

