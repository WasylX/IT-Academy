package task2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}

