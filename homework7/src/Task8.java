public class Task8 {
    public static void main(String[] args) {
        String[] inputTexts = {
                "До 8.00 06.03.2023",
                "До 08,00 06,03,2023",
                "До 09:00 06.03.2023",
                "До 11-00ч 07.03.2022г.",
                "До 07.03.2023 09:00",
                "До 12 ч. 00 мин. 09.03.2023.",
                "До 09:00 ч. 07.03.2023",
                "До 10.00,. 06.03.2023г.",
                "До 8.00 06.03.23",
                "до 12:00 03.03.2023"
        };

        for (String inputText : inputTexts) {
            String normalizedDate = normalizeDate(inputText);

            if (normalizedDate != null) {
                System.out.println("Нормализованная дата и время: " + normalizedDate);
            } else {
                System.out.println("Ошибка в формате строки: " + inputText);
            }
        }
    }

    public static String normalizeDate(String input) {
        String[] parts = input.split("\\s+");

        String datePart = "";
        String timePart = "";

        for (String part : parts) {
            if (part.matches(".*\\d{2}.\\d{2}.\\d{4}")) {
                datePart = part;
            } else if (part.matches(".*\\d{1,2}[:.,-]\\d{2}")) {
                timePart = part;
            } else if (part.matches(".*\\d{2}.\\d{2}.\\d{2,4}")) {
                datePart = part;
            }
        }

        if (!datePart.isEmpty() && !timePart.isEmpty()) {
            int day;
            int month;
            int year;
            int hour;
            int minute;

            String[] dateParts = datePart.split("[.,]");
            if (dateParts.length != 3) {
                dateParts = datePart.split("[:.,-]");
            }
            day = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);

            String[] timeParts = timePart.split("[:.,-]");
            hour = Integer.parseInt(timeParts[0]);
            minute = Integer.parseInt(timeParts[1]);

            return String.format("%02d.%02d.%04d %02d:%02d", day, month, year, hour, minute);
        }

        return null;
    }
}

