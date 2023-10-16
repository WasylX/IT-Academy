package task2;

public class Pair<T, E> {
    private T first;
    private E last;

    public Pair(T first, E last) {
        this.first = first;
        this.last = last;
    }

    public T first() {
        return first;
    }

    public E last() {
        return last;
    }


    public Pair<E, T> swap() {
        return new Pair<>(last, first);
    }

    public void replaceFirst(T newFirst) {
        this.first = newFirst;
    }

    public void replaceLast(E newLast) {
        this.last = newLast;
    }


    public String toString() {
        return"(" + first + ", " + last + ")";
    }
}

