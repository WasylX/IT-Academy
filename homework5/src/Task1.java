public class Task1 {
    public static void main(String[] args) {
        double[] array = {2.5, 1.0, 4.7, 3.2, 5.8, 2.0, 6.3, 2.1, 7.9, 3.5};

        double min = array[0];
        double max = array[0];
        double sum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}

