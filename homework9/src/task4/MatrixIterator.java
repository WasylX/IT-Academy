package task4;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {
    private final T[][] array;
    private int rowIndex;
    private int colIndex;

    public MatrixIterator(T[][] array) {
        this.array = array;
        rowIndex = 0;
        colIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return rowIndex < array.length && colIndex < array[rowIndex].length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }

        T element = array[rowIndex][colIndex];

        colIndex++;
        if (colIndex >= array[rowIndex].length) {
            colIndex = 0;
            rowIndex++;
        }

        return element;
    }
}

