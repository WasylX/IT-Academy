package by.it.academy.interval;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1, 3, true, false),
                new Interval(4, 6, true, false),
                new Interval(8, 11, true, true),
                new Interval(15, 20, false, true),
                new Interval(25, 30, true, true),
                new Interval(2, 5, false, true),
                new Interval(9, 16, false, false)
        };

        System.out.println("Интервалы:");

        for (Interval interval : intervals) {
            System.out.println(interval);
        }

        System.out.println();

        boolean hasIntersections = hasIntersections(intervals);

        if (!hasIntersections) {
            System.out.println("Нет пересечений между интервалами.");
        }

        System.out.println();

        System.out.println("Интервал 1 и Интервал 2 имеют пересечение: " + intervals[0].hasIntersections(intervals[1]));
        System.out.println("Интервал 1 и Интервал 5 имеют пересечение: " + intervals[0].hasIntersections(intervals[4]));

        System.out.println();

        Interval intersectionResult = getIntersection(intervals);
        System.out.println("Пересечение всех интервалов: " + intersectionResult);

        System.out.println();

        Interval[] unionResult = getUnion(intervals);
        System.out.println("Объединение интервалов: " + Arrays.toString(unionResult));
    }

    public static boolean hasIntersections(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].hasIntersections(intervals[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Interval getIntersection(Interval[] intervals) {
        Arrays.sort(intervals, Interval::compareToByStart);
        double maxStart = intervals[0].getStart();
        double minEnd = intervals[0].getEnd();

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].getStart() > maxStart) {
                maxStart = intervals[i].getStart();
            }
            if (intervals[i].getEnd() < minEnd) {
                minEnd = intervals[i].getEnd();
            }
        }

        if (maxStart > minEnd) {
            return null;
        }

        boolean inclusiveStart = false;
        boolean inclusiveEnd = false;
        for (Interval interval : intervals) {
            if ((interval.getStart() == maxStart && interval.isInclusiveStart()) ||
                    (interval.getEnd() == minEnd && interval.isInclusiveEnd())) {
                inclusiveStart = true;
            }
            if ((interval.getStart() == maxStart && interval.isInclusiveStart()) ||
                    (interval.getEnd() == minEnd && interval.isInclusiveEnd())) {
                inclusiveEnd = true;
            }
        }

        return new Interval(maxStart, minEnd, inclusiveStart, inclusiveEnd);
    }

    public static Interval[] getUnion(Interval[] intervals) {
        Arrays.sort(intervals, Interval::compareToByStart);

        int n = intervals.length;

        for (int i = 1; i < n; i++) {
            if (intervals[i].getStart() <= intervals[i - 1].getEnd() ||
                    (intervals[i].getStart() == intervals[i - 1].getEnd()
                            && (intervals[i].isInclusiveStart() || intervals[i - 1].isInclusiveEnd()))) {
                intervals[i] = intervals[i - 1].unite(intervals[i]);
                intervals[i - 1] = null;
            }
        }

        Interval[] result = new Interval[n];
        int index = 0;
        for (Interval interval : intervals) {
            if (interval != null) {
                result[index++] = interval;
            }
        }

        return Arrays.copyOf(result, index);
    }
}



