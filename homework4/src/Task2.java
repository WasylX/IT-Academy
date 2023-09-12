public class Task2 {
    public static void main(String[] args) {
        int startChar = 32;
        int endChar = 126;
        int charsPerRow = 5;

        for (int i = startChar; i <= endChar; i++) {
            System.out.printf("%d:%c\t", i, (char) i);

            if ((i - startChar + 1) % charsPerRow == 0) {
                System.out.println(); // Переход на новую строку после каждых charsPerRow символов
            }
        }
    }
}

