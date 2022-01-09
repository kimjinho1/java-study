package constructor;

// Constructor 테스트용 클래스
public class Student {
    public int studentNumber;
    public String studentName;
    public String grade;

    public Student(int studentNumber, String studentName, String grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
