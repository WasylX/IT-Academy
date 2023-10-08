public class Task4 {
    public static void main(String[] args) {
        String inputString = "  Это    строка     с       множеством    пробелов      ";

        String normalizedString = inputString.trim().replaceAll("\\s+", " ");

        System.out.println("Нормированная строка: \"" + normalizedString + "\"");
    }
}

