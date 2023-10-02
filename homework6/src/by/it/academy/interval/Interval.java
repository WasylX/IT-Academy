package by.it.academy.interval;

public class Interval {
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

    public Interval unite(Interval other) {
        double newStart = Math.min(this.start, other.start);
        double newEnd = Math.max(this.end, other.end);
        boolean newInclusiveStart = this.start < other.start ? this.inclusiveStart : other.inclusiveStart;
        boolean newInclusiveEnd = this.end > other.end ? this.inclusiveEnd : other.inclusiveEnd;
        return new Interval(newStart, newEnd, newInclusiveStart, newInclusiveEnd);
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public boolean isInclusiveStart() {
        return inclusiveStart;
    }

    public boolean isInclusiveEnd() {
        return inclusiveEnd;
    }
}

