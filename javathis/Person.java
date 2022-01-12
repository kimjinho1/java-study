package javathis;

// this
// 인스턴스 자신의 메모리를 가리킴
// 생성자에서 또 다른 생성자를 호출할 때 사용
// 자신의 주소(참조값)를 반환함
public class Person {

    String name;
    int age;

    // this를 이용하여 생성자에서 다른 생성자를 호출할 수 있다
    public Person() {
        this("진호", 25);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args)
    {
        Person p = new Person();
        p.name = "James";
        p.age = 37;

        Person p2 = p.getPerson();
        System.out.println(p);
        System.out.println(p2);
    }
}
