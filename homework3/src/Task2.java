
public class Task2 {
    public static void main(String[] args) {

        int monthNumber = 6;

        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Некорректный номер месяца";
        };

        System.out.println("Пора года для месяца " + monthNumber + ": " + season);
    }
}

