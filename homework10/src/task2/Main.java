package task2;

import java.util.Map;

import static task2.CharacterCounter.getCharsCount;

public class Main {
    public static void main(String[] args) {
        String input = "baaccc";
        Map<Character, Integer> charCountMap = getCharsCount(input);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }
    }
}

