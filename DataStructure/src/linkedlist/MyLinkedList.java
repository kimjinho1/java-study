package linkedlist;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
        }
    }

    public void addFirst(Object input) {
    }

    public void addLast(Object input) {
    }

    Node node(int index) {
    }

    public void add(int k, Object input) {
    }

    public String toString() {
    }

    public Object removeFirst() {
    }

    public Object remove(int k) {
    }

    public Object removeLast() {
    }

    public int size() {
        return size;
    }

    public Object get(int k) {
    }

    public int indexOf(Object data) {
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private Node lastReturned;
        private Node next;
        public int nextIndex;

        ListIterator() {
        }

        public Object next() {
        }

        public boolean hasNext() {
        }

        public void add(Object input) {
        }

        public void remove() {
        }
    }
}
