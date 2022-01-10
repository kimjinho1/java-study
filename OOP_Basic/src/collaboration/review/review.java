package collaboration.review;

// 객체 간의 협력 리뷰
public class review {
    public static void main(String[] args) {
        Student studentE = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        studentE.takeTaxi(taxi, 10000);
        studentE.showInfo();

        taxi.showInfo();
    }
}
