public class Task2 {
    public static void main(String[] args) {
        int z = 2147483647 + 1;
        System.out.println("Value of z: " + z);
        // Значение z отрицательное из-за переполнения переменной int, 2147483647 - максимальное значение для int
        // По этой причине результат оборачивается к минимальному значению -2147483648 для диапазона данных int

        long z1 = 2147483647 + 1;
        System.out.println("Value of z1: " + z1);
        // Результат не изменился так как каждый операнд обрабатывается как Integer, необходимо обозначить тип данных

        long z2 = 2147483647L + 1L;
        System.out.println("Value of z2: " + z2);
        // Обозначаем тип данных long с помощью суффикса 'L'

    }
}

