package interface_inheritance.ex3;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{

    @Override
    public ArrayList<String> getQueue() {
        return shelf;
    }

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
