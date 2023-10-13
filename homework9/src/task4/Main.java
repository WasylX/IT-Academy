package task4;

public class Main {
    public static void main(String[] args) {
        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        TwoDimensionalArrayIterator<Integer> iterator = new TwoDimensionalArrayIterator<>(array);

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
    }
}

