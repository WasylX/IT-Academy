import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 1, 4, 6, 2, 9, 5, 8,9};

        if (arr.length == 0) {
            System.out.println("Массив пустой");
            return;
        }

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            // Если количество элементов четное
            int middle1 = arr[n / 2 - 1];
            int middle2 = arr[n / 2];
            double median = (double) (middle1 + middle2) / 2;
            System.out.println("Медианное значение: " + median);
        } else {
            // Если количество элементов нечетное
            int middle = arr[n / 2];
            System.out.println("Медианное значение: " + middle);
        }
    }
}

