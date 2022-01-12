package method;

// 메서드
public class Method {
    public static void main(String[] args) {
        Student studentKim = new Student();

        studentKim.studentID = 123;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 송파구";

        studentKim.showStudentInfo();
    }
}
