package task1;

import java.io.Serializable;

 class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private final T t;
    private final V v;
    private final K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}

