package task4;

import java.util.*;

public class SortedList<E> implements List<E> {
    private final List<E> sortedList;
    private Comparator<? super E> comparator;

    public SortedList() {
        sortedList = new ArrayList<>();
        this.comparator = null;
    }

    public SortedList(Comparator<? super E> comparator) {
        sortedList = new ArrayList<>();
        this.comparator = comparator;
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
    public Iterator<E> iterator() {
        return sortedList.iterator();
    }

    @Override
    public boolean add(E e) {
        int index = 0;
        if (comparator != null) {
            while (index < sortedList.size() && comparator.compare(e, sortedList.get(index)) > 0) {
                index++;
            }
        } else {
            while (index < sortedList.size() && ((Comparable<? super E>) e).compareTo(sortedList.get(index)) > 0) {
                index++;
            }
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
        return sortedList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean added = sortedList.addAll(c);
        sortedList.sort(comparator);
        return added;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean added = sortedList.addAll(index, c);
        sortedList.sort(comparator);
        return added;
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

    public void setComparator(Comparator<? super E> comparator) {
        this.comparator = comparator;
        sortedList.sort(comparator);
    }

    public Comparator<? super E> getComparator() {
        return comparator;
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

    @Override
    public String toString() {
        return "SortedList{" +
                "sortedList=" + sortedList +
                '}';
    }
}

