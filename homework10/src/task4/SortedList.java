package task4;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public abstract class SortedList<E extends Comparable<E>> implements List<E> {
    private List<E> sortedList;

    protected SortedList() {
        sortedList = new ArrayList<>();
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    @Override
    public boolean isEmpty() {
        return sortedList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return sortedList.contains(o);
    }

    @Override
    public boolean add(E e) {
        int index = 0;
        while (index < sortedList.size() && e.compareTo(sortedList.get(index)) > 0) {
            index++;
        }
        sortedList.add(index, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return sortedList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(sortedList).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return sortedList.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return sortedList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return sortedList.retainAll(c);
    }

    @Override
    public void clear() {
        sortedList.clear();
    }

    @Override
    public E get(int index) {
        return sortedList.get(index);
    }

    @Override
    public E set(int index, E element) {
        E removed = sortedList.remove(index);
        add(element);
        return removed;
    }

    @Override
    public void add(int index, E element) {
        add(element);
    }

    @Override
    public E remove(int index) {
        return sortedList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return sortedList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return sortedList.lastIndexOf(o);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return sortedList.subList(fromIndex, toIndex);
    }

    @Override
    public ListIterator<E> listIterator() {
        return sortedList.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return sortedList.listIterator(index);
    }

    @Override
    public Object[] toArray() {
        return sortedList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return sortedList.toArray(a);
    }
}

