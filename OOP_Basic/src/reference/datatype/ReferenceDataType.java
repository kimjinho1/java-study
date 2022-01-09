package reference.datatype;

// 참조 자료형
public class ReferenceDataType {
    public static void main(String[] args) {
        Student student = new Student(201701311, "Jinho");

        student.setKoreaSubject("국어", 80);
        student.setMathSubject("수학", 100);

        student.showStudentScore();
    }
}
