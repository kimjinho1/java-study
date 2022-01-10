package collaborationex;

// 객체 간의 협력 리뷰
public class collaborationex {
    public static void main(String[] args) {
        Student studentJ = new Student("진호", 3750);
        Student studentH = new Student("현수", 7500);

        Bus bus3012 = new Bus(3012);

        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus3012);
        studentH.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentH.showInfo();

        bus3012.showBusInfo();

        subwayGreen.showSubwayInfo();
    }
}
