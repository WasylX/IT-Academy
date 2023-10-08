public class Task3 {
    public static void main(String[] args) {
        String inputText = "Ты никогда не пересечешь океан, если не наберешься смелости потерять из виду берег";

        String[] words = inputText.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            if (firstChar == lastChar) {
                result.append(firstChar).append(word.substring(1, word.length() - 1).toUpperCase()).append(lastChar);
            } else {
                if (isVowel(firstChar)) {
                    result.append(Character.toUpperCase(firstChar)).append(word.substring(1));
                } else if (isConsonant(firstChar)) {
                    result.append(word.substring(0, word.length() - 1)).append(Character.toUpperCase(lastChar));
                }
            }

            result.append(" ");
        }

        String transformedText = result.toString().trim();
        System.out.println("Преобразованный текст: " + transformedText);
    }

    private static boolean isVowel(char c) {
        return "АЕИОУаеиоуЁёЮюЯя".indexOf(c) != -1;
    }

    private static boolean isConsonant(char c) {
        return "БбВвГгДдЖжЗзЙйКкЛлМмНнПпРрСсТтФфХхЦцЧчШшЩщ".indexOf(c) != -1;
    }
}

