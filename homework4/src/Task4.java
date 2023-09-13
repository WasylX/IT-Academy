public class Task4 {
    public static void main(String[] args) {
        int number = 420;

        int evenCount = 0;
        int oddCount = 0;

        if (number < 0) { // Проверка и преобразование в случае, если число отрицательное
            number = Math.abs(number);
        }

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Количество четных цифр: " + evenCount);
        System.out.println("Количество нечетных цифр: " + oddCount);
    }
}

