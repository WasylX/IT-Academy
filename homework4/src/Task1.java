public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        int number = 50;
        while (count < 3 && number <= 90) {
            if (isPrime(number)) {
                count++;
                if (count == 3) {
                    System.out.println("Третье простое число между 50 и 90: " + number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

