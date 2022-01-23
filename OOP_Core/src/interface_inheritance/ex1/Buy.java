package interface_inheritance.ex1;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("Buy order");
    }
}
