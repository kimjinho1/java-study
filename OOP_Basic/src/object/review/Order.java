package object.review;

public class Order {
    String orderNumber;
    int phoneNumber;
    String orderHomeAddress;
    int orderDate;
    int orderTime;
    int orderPrice;
    int menuNumber;

    public Order(String orderNumber, int phoneNumber, String orderHomeAddress, int orderDate,
                 int orderTime, int orderPrice, int menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.orderHomeAddress = orderHomeAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }

    public void showOrderInfo() {
        System.out.println("주문 접수 번호 : " + orderNumber);
        System.out.println("주문 핸드폰 번호 : " + phoneNumber);
        System.out.println("주문 집 주소 : " + orderHomeAddress);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + orderPrice);
        System.out.println("메뉴 번호 : " + menuNumber);
    }
}
