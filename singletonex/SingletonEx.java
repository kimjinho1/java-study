package singletonex;

// 싱글톤 패턴 : 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
public class SingletonEx {
    public static void main(String[] args) {
        Company instance1 = Company.getInstance();
        Company instance2 = Company.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
