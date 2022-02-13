package generic.method;

// 제네릭 메서드
// public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수...) { }
public class GenericMethodTest {
    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<Integer, Double>(8, 8.0);

        double rect = GenericMethod.makeRectangle(p1, p2);
        System.out.println(rect);
    }
}
