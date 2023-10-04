package by.it.academy.bit;

public class Main {
    public static void main(String[] args) {
        // Создаем объект BooleanArray с начальной емкостью 1
        BooleanArray boolArray = new BooleanArray(1);

        // Добавление новых значений
        boolArray.add(true);
        boolArray.add(true);
        boolArray.add(false);
        boolArray.add(false);
        boolArray.add(true);
        boolArray.add(false);
        boolArray.add(true);
        boolArray.add(false);

        // Вывод начального состояния массива
        System.out.println("Начальное состояние массива:");
        boolArray.printBooleanArray();

        boolArray.set(1, false);
        boolArray.set(3, true);
        boolArray.set(5, true);
        boolArray.set(7, true);

        System.out.println("Измененное состояние массива:");
        boolArray.printBooleanArray();

        boolArray.remove(2);
        boolArray.remove(4);

        // Вывод конечного состояния массива
        System.out.println("Конечное состояние массива:");
        boolArray.printBooleanArray();
    }
}

