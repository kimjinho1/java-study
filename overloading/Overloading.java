package overloading;

// 오버로딩(생성자 중복 가능)
public class Overloading {
    public static void main(String[] args) {

        Student jinho1 = new Student();

        Student jinho2 = new Student(201701311, "Jinho");

        String info1 = jinho1.showStudentInfo();
        System.out.println(info1);

        String info2 = jinho2.showStudentInfo();
        System.out.println(info2);
    }
}
