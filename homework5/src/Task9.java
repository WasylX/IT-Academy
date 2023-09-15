import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] originalArray = {3, 1, 7, 1, 4, 6, 2, 9, 5, 8, 9};

        Arrays.sort(originalArray);

        int duplicateCount = 0;
        for (int i = 0; i < (originalArray.length - 1); i++) {
            if (originalArray[i] == originalArray[i + 1]) {
                duplicateCount++;
            }
        }

        int[] resultArray = new int[originalArray.length - duplicateCount];
        int index = 0;

        for (int i = 0; i < originalArray.length - 1; i++) {
            if (originalArray[i] != originalArray[i + 1]) {
                resultArray[index++] = originalArray[i];
            }
        }

        resultArray[index] = originalArray[originalArray.length - 1];

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Результирующий массив: " + Arrays.toString(resultArray));
    }
}

