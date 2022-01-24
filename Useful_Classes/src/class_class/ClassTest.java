package class_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// reflection 프로그래밍
// Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 확인, 인스턴스를 생성, 메서드를 호출하는 방식의 프로그래밍
// 로컬 메모리에 객체가 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용함

// Class의 newInstance()메서드로 인스턴스를 생성할 수 있다
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Person person = new Person("James");
        System.out.println(person);
        System.out.println();

        Class c1 = Class.forName("class_class.Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);
        System.out.println();

        System.out.println(String.class);
        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);
        System.out.println(cons);
        System.out.println();

//        Object initargs = "김유신";
        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
    }
}
