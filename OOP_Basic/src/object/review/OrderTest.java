package object.review;

// 객체 복습
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("202011020003", 01023450001, "서울시 송파구 잠실동 111-222",
                20201102, 130258, 35000, 0003);

        order.showOrderInfo();
    }
}
