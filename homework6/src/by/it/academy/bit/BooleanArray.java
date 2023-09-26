package by.it.academy.bit;

public class BooleanArray {
    private boolean[] data;
    private int size;

    public BooleanArray(int capacity) {
        data = new boolean[capacity];
        size = 0;
    }

    public void add(boolean v) {
        ensureCapacity(size + 1);
        data[size++] = v;
    }

    public boolean get(int i) {
        if (isValidIndex(i)) {
            return data[i];
        }
        return false;
    }

    public void add(int i, boolean v) {
        if (isValidIndex(i)) {
            ensureCapacity(size + 1);
            System.arraycopy(data, i, data, i + 1, size - i);
            data[i] = v;
            size++;
        }
    }

    public void set(int i, boolean v) {
        if (isValidIndex(i)) {
            data[i] = v;
        }
    }

    public boolean remove(int i) {
        if (isValidIndex(i)) {
            boolean removedValue = data[i];
            System.arraycopy(data, i + 1, data, i, size - i - 1);
            size--;
            return removedValue;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(data.length * 2, minCapacity);
            boolean[] newData = new boolean[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    private boolean isValidIndex(int i) {
        return i >= 0 && i < size;
    }
}

