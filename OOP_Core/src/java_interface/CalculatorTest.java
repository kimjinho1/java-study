package java_interface;

// 인터페이스
// 모든 메서드는 추상 메서드, 모든 변수는 상수로 선언된다.
// 인터페이스로 구현한 클래스는 인터페이스 형으로 선언한 변수로 형변환 할 수 있다.
// 클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있다.

// 인터페이스 이걸 왜쓰나??
// 일종의 클라이언트 코드와의 약속, 클래스나 프로그램이 제공하는 명세서(specification) 같은 느낌
// 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용하면 됨

// 자바8 이후로 defalut, static 메서드 생성 가능
// defalut 메서드: 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드(구현을 가지는 메서드)
// 구현 하는 클래스에서 오버라이딩 가능
// static 메서드: 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드

// 자바9 이후로 private 메서드 생성 가능
// private 메서드: 인터페이스 내부에서만 사용하기 위해 구현하는 메서드, defalut, static 메서드에서 사용 가능
public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 2;
        int[] nums = {1, 2, 3};

//        Calc calc = new CompleteCalc();
        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.divide(num1, 0));

        calc.description();
        calc.showInfo();
        System.out.println(Calc.total(nums));
    }
}
