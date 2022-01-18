package inheritance;

// 상속
// 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할때 기존 클래스를 상속함
// 하위 클래스가 상위 클래스의 속성과 기능을 확장(extends)한다는 의미
// 자바는 단일 상속(single inheritance)만을 지원함

// 하위 클래스를 생성하면 상위 클래스가 먼저 생성됨(super)
// super()는 상위 클래스의 기본 생성자를 호출함
// 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됨(이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함)
// 상위 클래스의 기본 생성자가 없는 경우(다른 생성자가 있는 경우) 하위 클래스에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 함

// 형 변환(업캐스팅)
// 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함
// EX -> Customer customerLee = new VIPCustomer();
// 변수의 타입이 Customer이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드이다.

// 오버라이딩(overriding)
// 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 다른 경우
// 하위 클래스에서 동일한 이름의 메서드를 재정의할 수 있음
public class CustomerTest {
    public static void main(String[] args) {
        Customer customerS = new Customer();
        customerS.setCustomerName("신현수1");
        customerS.setCustomerID(10010);
        customerS.bonusPoint = 1000;
        int priceS = customerS.calcPrice(1000);
        System.out.println(customerS.showCustomerInfo() + " 지불금액은 " + priceS + "원 입니다.");
        System.out.println();

        VIPCustomer customerK = new VIPCustomer(10030, "김진호");
        customerK.bonusPoint = 10000;
        int priceK = customerK.calcPrice(10000);
        System.out.println(customerK.showCustomerInfo() + " 지불금액은 " + priceK + "원 입니다.");
        System.out.println();

//      형 변환과 오버라이딩 메서드 호출
//      자바에서는 항상 인스턴스의 메서드가 호출된다(가상메서드의 원리)
        Customer vc = new VIPCustomer();
        vc.bonusPoint = 10000;
        int priceVC = vc.calcPrice(10000);
        System.out.println(vc.showCustomerInfo() + " 지불금액은 " + priceVC + "원 입니다.");
    }
}