package task6;

public class SimpleCalendar {
    public static void main(String[] args) {
        getDayInfo(75);
        getDayOfYear(Month.FEBRUARY, 15);
    }

     static void getDayInfo(int dayOfYear) {
        int monthIndex = 0;
        int dayOfMonth;
        int dayOfWeek = 1;

        while (true) {
            int daysInMonth = Month.values()[monthIndex].getDays();
            if (dayOfYear <= daysInMonth) {
                dayOfMonth = dayOfYear;
                break;
            }
            dayOfYear -= daysInMonth;
            monthIndex++;
        }

        Month month = Month.values()[monthIndex];
        dayOfWeek = (dayOfWeek + dayOfYear - 1) % 7;
        Season season = getSeason(monthIndex);

        System.out.println("1. For your day of the year:");
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Day of Week: " + DayOfWeek.values()[(dayOfWeek + 2) % 7]);
        System.out.println("Season: " + season);
        System.out.println("-------------------");
    }

     static void getDayOfYear(Month month, int dayOfMonth) {
        int dayOfYear = dayOfMonth;

        for (int i = 0; i < month.ordinal(); i++) {
            dayOfYear += Month.values()[i].getDays();
        }

        System.out.println("2. For " + month + " and day " + dayOfMonth + ":");
        System.out.println("Day of Year: " + dayOfYear);
    }

     static Season getSeason(int monthIndex) {
        if (monthIndex >= 2 && monthIndex <= 4) {
            return Season.SPRING;
        } else if (monthIndex >= 5 && monthIndex <= 7) {
            return Season.SUMMER;
        } else if (monthIndex >= 8 && monthIndex <= 10) {
            return Season.AUTUMN;
        } else {
            return Season.WINTER;
        }
    }
}

