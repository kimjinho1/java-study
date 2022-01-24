package class_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Class 클래스
// Class 클래스는 컴파일된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드를 제공함

// 동적 로딩
// 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법
// 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c3 =  Class.forName("java.lang.String");

        Constructor<String>[] cons =  c3.getConstructors();
        for(Constructor con: cons) {
            System.out.println(con);
        }

        System.out.println();

        Method[] methods = c3.getMethods();
        for(Method  method : methods) {
            System.out.println(method);
        }
    }
}
