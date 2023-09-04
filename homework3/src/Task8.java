public class Task8 {
    public static void main(String[] args) {
        //Исходные данные
        displayDateByDayOfYear(360);
        displayDateByMonthAndDay(13, 24);
        displayWeekdayType(3);
    }

    public static void displayDateByMonthAndDay(int month, int dayOfMonth) {
        if (month < 1 || month > 13 || dayOfMonth < 1 || dayOfMonth > 28) {
            System.out.println("Не день месяца");
        } else {
            int dayOfYear = (month - 1) * 28 + dayOfMonth;
            String monthName = getMonthName(month);
            String dayOfWeek = getDayOfWeek(dayOfYear);

            System.out.println(dayOfMonth + " " + monthName + ", " + dayOfWeek);
        }
    }

    public static void displayDateByDayOfYear(int dayOfYear) {
        if (dayOfYear < 1 || dayOfYear > 364) {
            System.out.println("Не день года");
        } else {
            int month = (dayOfYear - 1) / 28 + 1;
            int dayOfMonth = (dayOfYear - 1) % 28 + 1;
            String monthName = getMonthName(month);
            String dayOfWeek = getDayOfWeek(dayOfYear);

            System.out.println(dayOfMonth + " " + monthName + ", " + dayOfWeek);
        }
    }

    public static void displayWeekdayType(int dayOfWeek) {
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Не день недели");
        } else {
            String weekdayType = (dayOfWeek >= 1 && dayOfWeek <= 5) ? "Будний" : "Выходной";
            System.out.println(weekdayType);
        }
    }


    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "Января";
            case 2 -> "Февраля";
            case 3 -> "Марта";
            case 4 -> "Апреля";
            case 5 -> "Мая";
            case 6 -> "Июня";
            case 7 -> "Июля";
            case 8 -> "Августа";
            case 9 -> "Сентября";
            case 10 -> "Октября";
            case 11 -> "Ноября";
            case 12 -> "Декабря";
            case 13 -> "Бредября";
            default -> "Неверный месяц";
        };
    }

    public static String getDayOfWeek(int dayOfYear) {
        int dayOfWeek = (dayOfYear - 1) % 7 + 1;
        return switch (dayOfWeek) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "Неверный день недели";
        };
    }
}

