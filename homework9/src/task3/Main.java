package task3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.setElement(0, 10);
        integerArray.setElement(1, 20);
        integerArray.setElement(2, 30);
        integerArray.setElement(3, 35);
        integerArray.setElement(4, 25);

        Iterator<Integer> iterator = integerArray.getIterator();
        while (iterator.hasNext()) {
            iterator.next();
            System.out.println("-------------");
        }
        System.out.println("IntegerArray: " + "\n" + integerArray);
        System.out.println("------------------------------------------------");
        int changedElement1 = integerArray.changeElement(0, 45);
        System.out.println("Заменен элемент с индексом: " + changedElement1);
        System.out.println(integerArray);
        System.out.println("------------------------------------------------");

        int elementAtIndex2 = integerArray.getElement(2);
        System.out.println("Элемент с индексом 2: " + elementAtIndex2);
    }
}

