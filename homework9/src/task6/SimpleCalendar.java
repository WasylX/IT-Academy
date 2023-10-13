package task6;

public class SimpleCalendar {
    public static void main(String[] args) {
        getDayInfo(75);

        int dayOfYear = getDayOfYear(Month.FEBRUARY, 15);
        System.out.println("2. " + "Day of Year: " + dayOfYear);
    }

    public static void getDayInfo(int dayOfYear) {
        Month[] months = Month.values();
        int monthIndex = (dayOfYear - 1) / 30;
        int dayOfMonth = (dayOfYear - 1) % 30 + 1;
        DayOfWeek dayOfWeek = DayOfWeek.values()[(dayOfYear - 1) % 7];
        Season season = Season.values()[monthIndex / 3];

        System.out.println("1. For " + dayOfYear + " day of the year: ");
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Month: " + months[monthIndex].name());
        System.out.println("Day of Week: " + dayOfWeek.name());
        System.out.println("Season: " + season.name());
        System.out.println("-------------------");
    }

    public static int getDayOfYear(Month month, int dayOfMonth) {
        return (month.ordinal() * 30) + dayOfMonth;
    }
}

