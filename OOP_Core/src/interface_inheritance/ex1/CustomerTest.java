package interface_inheritance.ex1;

// 여러 인터페이스 구현
// 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스에 여러 인터페이를 구현 할 수 있다
// 디폴트 메서드가 중복되는 경우, 오버라이딩 필요
// 여러 인터페이스로 구현한 클래스는 인터페이스 타입으로 형변환 되는 경우, 해당 인터페이스에 선언된 메서드만 사용 가능함
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.sell();
        customer.buy();
        customer.order();
        customer.hello();
        System.out.println();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();
        System.out.println();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
