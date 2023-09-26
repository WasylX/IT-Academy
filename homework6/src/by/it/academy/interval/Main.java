package by.it.academy.interval;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 3, true, false);
        Interval interval2 = new Interval(4, 6, true, false);
        Interval interval3 = new Interval(8, 11, true, true);
        Interval interval4 = new Interval(15, 20, false, true);
        Interval interval5 = new Interval(25, 30, true, true);
        Interval interval6 = new Interval(2, 5, false, true);
        Interval interval7 = new Interval(9, 16, false, false);

        System.out.println("Интервал 1: " + interval1);
        System.out.println("Интервал 2: " + interval2);
        System.out.println("Интервал 3: " + interval3);
        System.out.println("Интервал 4: " + interval4);
        System.out.println("Интервал 5: " + interval5);
        System.out.println("Интервал 6: " + interval6);
        System.out.println("Интервал 7: " + interval7);

        System.out.println();

        Interval[] intervals = {interval1, interval2, interval3, interval4, interval5, interval6, interval7};
        boolean hasIntersections = Interval.findIntersections(intervals);

        if (!hasIntersections) {
            System.out.println("Нет пересечений между интервалами.");
        }

        // Тут немного не понял что должно выводится, интервалы у которых есть пересечения в принципе?
        // Или только проверка нескольких, отдельных интервалов на выбор(сделал два независимых)

        System.out.println();

        System.out.println("Интервал 1 и Интервал 2 имеют пересечение: " + interval1.hasIntersections(interval2));
        System.out.println("Интервал 1 и Интервал 5 имеют пересечение: " + interval1.hasIntersections(interval5));

        System.out.println();

        Interval intersectionResult = Interval.intersection(new Interval[]{interval1, interval2, interval6});
        System.out.println("Пересечение интервалов 1, 2 и 6: " + intersectionResult);

        System.out.println();

        Interval[] unionResult = Interval.union(new Interval[]
                {interval1, interval2, interval3, interval4, interval5, interval6, interval7});
        System.out.println("Объединение интервалов: " + Arrays.toString(unionResult));
    }
}

