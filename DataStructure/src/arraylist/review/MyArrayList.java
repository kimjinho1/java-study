package arraylist.review;

import java.util.ListIterator;

public class MyArrayList implements MyArrayListInterface {

    private int size = 0;
    private Object[] elementData = new Object[100];


    @Override
    public boolean addLast(Object element) {
        return false;
    }

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public boolean addFirst(Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }
}
