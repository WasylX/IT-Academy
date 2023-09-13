public class Task8 {
    public static void main(String[] args) {
        System.out.println("Совершенные числа от 1 до 10,000:");

        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}

