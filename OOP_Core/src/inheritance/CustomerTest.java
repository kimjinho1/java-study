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
public class CustomerTest {
    public static void main(String[] args) {
        Customer customerS1 = new Customer();
        customerS1.setCustomerName("신현수1");
        customerS1.setCustomerID(10010);
        customerS1.bonusPoint = 1000;
        System.out.println(customerS1.showCustomerInfo());
        System.out.println();

        VIPCustomer customerS2 = new VIPCustomer();
        customerS2.setCustomerName("신현수2");
        customerS2.setCustomerID(10020);
        customerS2.bonusPoint = 5000;
        System.out.println(customerS2.showCustomerInfo());
        System.out.println();

        VIPCustomer customerK = new VIPCustomer(10030, "김진호");
        customerK.bonusPoint = 10000;
        System.out.println(customerK.showCustomerInfo());
        System.out.println();


        Customer vc = new VIPCustomer();
    }
}