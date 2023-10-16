package task3;

import java.util.Arrays;
import java.util.Iterator;

public class GenericArray<T> implements Iterable<T> {
    private final T[] array;
    private final int size;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
        this.size = size;
    }

    public void setElement(int index, T value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Недопустимый индекс");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.println("Недопустимый индекс");
            return null;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    public int changeElement(int index, T value) {
        setElement(index, value);
        return index;
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public Iterator<T> getIterator() {
        return new ArrayIterator();
    }


    class ArrayIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T element = array[currentIndex];
                currentIndex++;
                return element;
            } else {
                return null;
            }
        }
    }
}

