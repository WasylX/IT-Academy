public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 1, 7},
                {1, 4, 6},
                {2, 9, 5},
                {8, 9, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        System.out.println("Транспонированная матрица:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

