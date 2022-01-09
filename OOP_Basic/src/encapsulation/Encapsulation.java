package encapsulation;

// 정보 은닉을 활용한 캡슐화
public class Encapsulation {
    public static void main(String[] args) {
        MakeReport report = new MakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}
