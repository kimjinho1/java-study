package abstract_class;

// 추상 클래스
// 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
// abstract 예약어를 사용, 인스턴스화(new) 불가능
// 모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스이기 때문에 인스턴스화 불가능
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        Notebook myNote = new MyNotebook();
    }
}
