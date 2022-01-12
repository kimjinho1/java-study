package singleton.review;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            CarFactory instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
