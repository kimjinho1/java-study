package abstract_class;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    void turnOn() {
        System.out.println("전원을 킴");
    }

    void turnOff() {
        System.out.println("전원을 끔");
    }
}
