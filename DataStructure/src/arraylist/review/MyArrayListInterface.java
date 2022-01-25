package arraylist.review;

import arraylist.MyArrayList;

public interface MyArrayListInterface {

    public boolean addLast(Object element);
    public boolean add(int index, Object element);
    public boolean addFirst(Object element);
    public String toString();
    public Object remove(int index);
    public Object removeFirst();
    public Object removeLast();
    public Object get(int index);
    public int size();
    public int indexOf(Object element);
}
