package template_method_pattern;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행 시작");
        System.out.println("자동으로 무빙 중");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에 멈침");
    }
}
