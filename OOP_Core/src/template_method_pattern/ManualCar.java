package template_method_pattern;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전 시작.");
        System.out.println("사람이 핸들을 조작.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지.");
    }
}
