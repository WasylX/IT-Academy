public class Task6 {
    public static void main(String[] args) {
        for (int i = 20; i <= 30; i++) {
            System.out.print("Для числа " + i + ": ");
            int currentNumber = i;

            while (currentNumber != 1) {
                System.out.print(currentNumber + " ");
                if (currentNumber % 2 == 0) {
                    currentNumber /= 2;
                } else {
                    currentNumber = (currentNumber * 3) + 1;
                }
            }

            System.out.println("1");
        }
    }
}

