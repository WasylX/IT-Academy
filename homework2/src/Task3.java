public class Task3 {
    public static void main(String[] args) {
        int number = 123;
        // Число не было предопределено, примем значение '123'

        int lastTwoDigits = number % 100;
        int firstTwoDigits = number / 10;

        System.out.println("lastTwoDigits: " + lastTwoDigits);
        System.out.println("firstTwoDigits: " + firstTwoDigits);

    }
}

