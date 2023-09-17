public class Task4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 1, 4, 6, 2, 9, 5, 8,9};

        int numRows = arr.length;
        int[][] result = new int[numRows][];

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > currentValue) {
                    count++;
                }
            }

            int[] row = new int[count];
            int index = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > currentValue) {
                    row[index++] = arr[j];
                }
            }

            result[i] = row;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

