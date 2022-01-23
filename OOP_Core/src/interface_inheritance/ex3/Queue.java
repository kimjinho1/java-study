package interface_inheritance.ex3;

import java.util.ArrayList;

public interface Queue {

    ArrayList<String> getQueue();
    void enQueue(String title);
    String deQueue();

    int getSize();
}
