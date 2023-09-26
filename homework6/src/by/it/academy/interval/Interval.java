package by.it.academy.interval;

import java.util.Arrays;
 class Interval {
    private double start;
    private double end;
    private boolean inclusiveStart;
    private boolean inclusiveEnd;

    public Interval(double start, double end, boolean inclusiveStart, boolean inclusiveEnd) {
        this.start = start;
        this.end = end;
        this.inclusiveStart = inclusiveStart;
        this.inclusiveEnd = inclusiveEnd;
    }

    public String toString() {
        String startBracket = inclusiveStart ? "[" : "(";
        String endBracket = inclusiveEnd ? "]" : ")";
        return startBracket + start + ", " + end + endBracket;
    }

    public boolean hasIntersections(Interval other) {
        if (this.end < other.start || other.end < this.start) {
            return false;
        }
        if (this.end == other.start && (!this.inclusiveEnd || !other.inclusiveStart)) {
            return false;
        }
        if (this.start == other.end && (!this.inclusiveStart || !other.inclusiveEnd)) {
            return false;
        }
        return true;
    }

     public int compareToByStart(Interval other) {
         if (this.start < other.start) {
             return -1;
         } else if (this.start > other.start) {
             return 1;
         } else {
             if (this.end < other.end) {
                 return -1;
             } else if (this.end > other.end) {
                 return 1;
             } else {
                 return (this.inclusiveStart ? 1 : 0) - (other.inclusiveStart ? 1 : 0);
             }
         }
     }

     public static boolean findIntersections(Interval[] intervals) {
         boolean hasIntersections = false;

         for (int i = 0; i < intervals.length; i++) {
             for (int j = i + 1; j < intervals.length; j++) {
                 if (intervals[i].hasIntersections(intervals[j])) {
                     System.out.println("Интервал " + intervals[i] + " и интервал " +
                             intervals[j] + " имеют пересечение.");
                     hasIntersections = true;
                 }
             }
         }

         return hasIntersections;
     }

    public static Interval intersection(Interval[] intervals) {
        Arrays.sort(intervals, Interval::compareToByStart);

        double maxStart = intervals[0].start;
        double minEnd = intervals[0].end;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start > maxStart) {
                maxStart = intervals[i].start;
            }
            if (intervals[i].end < minEnd) {
                minEnd = intervals[i].end;
            }
        }

        if (maxStart > minEnd) {
            return null;
        }

        boolean inclusiveStart = false;
        boolean inclusiveEnd = false;
        for (Interval interval : intervals) {
            if ((interval.start == maxStart && interval.inclusiveStart) ||
                    (interval.end == minEnd && interval.inclusiveEnd)) {
                inclusiveStart = true;
            }
            if ((interval.start == maxStart && interval.inclusiveStart) ||
                    (interval.end == minEnd && interval.inclusiveEnd)) {
                inclusiveEnd = true;
            }
        }

        return new Interval(maxStart, minEnd, inclusiveStart, inclusiveEnd);
    }

     public static Interval[] union(Interval[] intervals) {
         Arrays.sort(intervals, Interval::compareToByStart);

         int n = intervals.length;

         for (int i = 1; i < n; i++) {
             if (intervals[i].start <= intervals[i - 1].end || (intervals[i].start == intervals[i - 1].end
                     && (intervals[i].inclusiveStart || intervals[i - 1].inclusiveEnd))) {
                 intervals[i] = new Interval(intervals[i - 1].start, Math.max(intervals[i].end, intervals[i - 1].end),
                         intervals[i - 1].inclusiveStart, intervals[i].inclusiveEnd);
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

