public class Task7 {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        int count = 0;

        while (true) {
            sum += n;
            count++;

            if (endsWithFiveZeros(sum)) {
                break;
            }

            n++;
        }

        System.out.println("Сумма первых N натуральных чисел: " + sum);
        System.out.println("Количество чисел первых N натуральных чисел: " + count);
    }

    public static boolean endsWithFiveZeros(long num) {
        return num % 100000 == 0;
    }
}

