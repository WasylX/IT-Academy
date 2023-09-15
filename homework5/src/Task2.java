import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 1, 4, 6, 2, 9, 5, 8,9};

        int minValue = arr[0];
        int maxValue = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            } else if (minValue == arr[i]) {
                indexOfMin = i;
            }
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                indexOfMax = i;
            }
        }

        int temp = arr[indexOfMin];
        arr[indexOfMin] = arr[indexOfMax];
        arr[indexOfMax] = temp;

        System.out.println(Arrays.toString(arr));
    }
}

