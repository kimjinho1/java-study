package constructor;

// 생성자
public class Constructor {
    public static void main(String[] args) {

        Student jinho = new Student(201701311, "Jinho", "4");

        String info = jinho.showStudentInfo();
        System.out.println(info);
    }
}
