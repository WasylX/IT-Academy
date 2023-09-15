public class Task3 {
    public static void main(String[] args) {
        int day = 8;
        int month = 10;

        int[] daysInMonth = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }

        System.out.println("Порядковый номер дня в году: " + dayOfYear);
    }
}

