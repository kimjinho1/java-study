package interface_inheritance.ex3;

// 클래스 상속, 인터페이스 구현 함께 쓰기
// 실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속, 인터페이스의 구현을 같이 사용하는 경우가 많다!
public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("해리포터1");
        bookQueue.enQueue("해리포터2");
        bookQueue.enQueue("해리포터3");

        System.out.println(bookQueue.getQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
