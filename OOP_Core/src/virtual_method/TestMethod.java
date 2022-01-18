package virtual_method;

// 자바에서는 항상 인스턴스의 메서드가 호출된다
// 메서드는 명령어의 set이고 프로그램이 로드되면 메서드 영역(코드 영역)에 위치함(처음 한번만 로드 됨)
// 인스턴스가 생성되면 변수는 힙 메모리에, 메서드에서 사용하는 변수들은 스택 메모리에 생성된다

// 가상 메서드 테이블(vitual method table)에서 해당 메서드에 대한 address를 가지고 있음
// 재정의된 경우는 재정의 된 메서드의 주소를 가리킴
public class TestMethod {
    int num;

    void aaa() {
        System.out.println("aaa() 호출");
    }

    public static void main(String[] args) {
        TestMethod a1 = new TestMethod();
        a1.aaa();

        TestMethod a2 = new TestMethod();
        a2.aaa();
    }
}
