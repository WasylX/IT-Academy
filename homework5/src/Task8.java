public class Task8 {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];

        int maxValue = 6; // Максимальное абсолютное значение случайных чисел
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 0; // Главная диагональ
                } else if (i + j == n - 1) {
                    matrix[i][j] = 0; // Побочная диагональ
                } else if (i < j) {
                    matrix[i][j] = (int) (Math.random() * maxValue) + 1; // Сверху от диагоналей положительные числа
                } else {
                    matrix[i][j] = -(int) (Math.random() * maxValue) - 1; // Слева от диагоналей отрицательные числа
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Сумма всех элементов: " + sum);

        int count = 0;
        int sumGreaterThanSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > sum) {
                    sumGreaterThanSum += matrix[i][j];
                    count++;
                }
            }
        }

        double average = count > 0 ? (double) sumGreaterThanSum / count : 0;

        System.out.printf("Среднее арифметическое всех элементов больше %d: %.4f\n", sum, average);
    }
}

