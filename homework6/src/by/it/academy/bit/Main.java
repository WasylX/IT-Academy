package by.it.academy.bit;

public class Main {
    public static void main(String[] args) {
        // Создаем объект BooleanArray с начальной емкостью 10
        BooleanArray boolArray = new BooleanArray(10);

        // 1. Добавление нового значения в конец массива: add(boolean v)
        boolArray.add(true);
        boolArray.add(false);
        boolArray.add(true);
        boolArray.add(true);
        boolArray.add(false);

        // Вывод начального состояния массива
        System.out.println("Начальное состояние массива:");
        printBinaryBooleanArray(boolArray);

        // 2. Получение значения по индексу: boolean get(int i)
        System.out.println("Значение по индексу 2: " + boolArray.get(2));
        System.out.println("Значение по индексу 5: " + boolArray.get(5));

        // 3. Добавление значения по индексу: void add(int i, boolean v)
        boolArray.add(1, false);
        boolArray.add(3, false);

        // 4. Изменение значения по индексу: void set(int i, boolean v)
        boolArray.set(0, false);
        boolArray.set(4, true);

        // 5. Удаление значения по индексу: boolean remove(int i)
        boolean removedValue = boolArray.remove(2);
        System.out.println("Удаленное значение: " + removedValue);

        // 6. Получение длины массива: int size()
        System.out.println("Длина массива: " + boolArray.size());

        // Вывод конечного состояния массива
        System.out.println("Конечное состояние массива:");
        printBinaryBooleanArray(boolArray);
    }

    // Метод для вывода массива boolean в бинарной форме
    private static void printBinaryBooleanArray(BooleanArray boolArray) {
        int size = boolArray.size();
        for (int i = 0; i < size; i++) {
            System.out.print(boolArray.get(i) ? "1" : "0");
        }
        System.out.println();
    }
}

