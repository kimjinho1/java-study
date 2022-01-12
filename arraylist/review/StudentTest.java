package arraylist.review;

// ArrayList 리뷰
public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");

        studentLee.addSubject("국어", 70);
        studentLee.addSubject("수학", 80);

        Student studentKim = new Student("Kim");

        studentKim.addSubject("국어", 50);
        studentKim.addSubject("수학", 100);
        studentKim.addSubject("영어", 70);

        studentLee.showStudentInfo();
        System.out.println("======================================");
        studentKim.showStudentInfo();

    }
}