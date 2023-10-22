package task4;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SortedList<Integer> sortedList = new SortedList<>();


        sortedList.add(5);
        sortedList.add(2);
        sortedList.add(8);
        sortedList.add(4);
        sortedList.add(10);

        System.out.println("Sorted List: " + sortedList);

        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        sortedList.setComparator(reverseComparator);

        System.out.println("Reversed Sorted List: " + sortedList);
    }
}

