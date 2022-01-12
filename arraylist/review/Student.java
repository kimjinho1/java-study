package arraylist.review;

import java.util.ArrayList;

public class Student {
    private static int serialNum = 1000;
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(String studentName) {
        serialNum++;
        this.studentId = serialNum;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo()
    {
        int total = 0;

        System.out.println(studentName + ", " + studentId);
        for (Subject s : subjectList){
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " +
                    s.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
