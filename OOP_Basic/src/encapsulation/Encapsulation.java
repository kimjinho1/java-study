package encapsulation;

// 정보 은닉을 활용한 캡슐화
// 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함
// 메서드나 멤버 변수에 접근할 때 발생하는 오류를 최소화함
public class Encapsulation {
    public static void main(String[] args) {
        MakeReport report = new MakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}
