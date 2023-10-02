package by.it.academy.bit;

public class BooleanArray {
    private byte[] data;
    private int size;

    public BooleanArray(int capacity) {
        data = new byte[capacity];
        size = 0;
    }

    public void add(boolean v) {
        ensureCapacity(size + 1);
        int byteIndex = size / 8;
        int bitIndex = size % 8;
        if (v) {
            data[byteIndex] |= (1 << bitIndex);
        }
        size++;
    }

    public void set(int i, boolean v) {
        if (isValidIndex(i)) {
            int byteIndex = i / 8;
            int bitIndex = i % 8;
            if (v) {
                data[byteIndex] |= (1 << bitIndex);
            } else {
                data[byteIndex] &= ~(1 << bitIndex);
            }
        }
    }

    public void remove(int i) {
        if (isValidIndex(i)) {
            int byteIndex = i / 8;
            int bitIndex = i % 8;
            for (int j = i; j < size - 1; j++) {
                int nextByteIndex = (j + 1) / 8;
                int nextBitIndex = (j + 1) % 8;
                boolean nextBitValue = (data[nextByteIndex] & (1 << nextBitIndex)) != 0;
                if (nextBitValue) {
                    data[byteIndex] |= (1 << bitIndex);
                } else {
                    data[byteIndex] &= ~(1 << bitIndex);
                }
                byteIndex = nextByteIndex;
                bitIndex = nextBitIndex;
            }
            size--;
        }
    }

    public void printBooleanArray() {
        for (int i = 0; i < size; i++) {
            int byteIndex = i / 8;
            int bitIndex = i % 8;
            boolean bitValue = (data[byteIndex] & (1 << bitIndex)) != 0;
            System.out.print(bitValue + " ");
        }
        System.out.println();
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length * 8) {
            int newCapacity = Math.max(data.length * 2, minCapacity / 8);
            byte[] newData = new byte[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    private boolean isValidIndex(int i) {
        return i >= 0 && i < size;
    }
}

