public class Task3 {
    public static void main(String[] args) {
        int n = 10000;
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("Первые " + n + " чисел Фибоначчи:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

