public class Task5 {
    public static void main(String[] args) {
        String inputText = "  This is a   simple text, with some simple words. This is not a simple task    !  ";

        // Удаляем пробелы в начале и конце текста, а также знаки препинания
        String cleanedText = inputText.trim().replaceAll("[^a-zA-Z ]", "");

        String[] words = cleanedText.toLowerCase().split("\\s+");

        String[] uniqueWords = new String[words.length];
        int uniqueCount = 0;

        // Проверяем каждое слово на уникальность
        for (String word : words) {
            if (!word.isEmpty() && !contains(uniqueWords, uniqueCount, word)) {
                uniqueWords[uniqueCount] = word;
                uniqueCount++;
            }
        }

        System.out.println("Количество уникальных слов: " + uniqueCount);
    }

    private static boolean contains(String[] array, int length, String word) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}

