package task1;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (K element : ks) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        return map;
    }
}

