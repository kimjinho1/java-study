package object_class_method;

// equals: 두 인스턴스의 주소 값을 비교하여 true/false를 반환
// hashCode: 인스턴스의 저장 주소를 반환함
// clone: 객체의 원본을 복제 -> cloneable 인터페이스를 명시해줘야 함

// String에서의 equals vs ==
// ==: 주소값을 비교해서 같으면 true, 다르면 false 반환
// equals: 주소값이 같으면 내용도 같으니 true 반환, 주소값 다를시 내용을 비교하여 같으면 true, 다르면 false 반환

// equals, hashCode 메서드 재정의 예시
// 두 인스턴스가 같다? -> 두 인스턴스에 대한 equals()의 반환 값이 true -> 동일한 hashCode() 값을 반환
// 논리적으로 동일함을 위해 equals() 메서드를 재정의했다면 hashCode()메서드도 재정의하여 동일한 hashCode 값이 반환되도록 해야 한다
public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student Lee = new Student(100, "Lee");
        Student Lee2 = Lee;
        Student Shun = new Student(100, "Lee");

        System.out.println(Lee == Shun);
        System.out.println(Lee.equals(Shun));

        System.out.println(Lee.hashCode());
        System.out.println(Shun.hashCode());
        System.out.println();

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
        System.out.println();

        Student Lee3 = (Student)Lee.clone();
        System.out.println(Lee == Lee3);
        System.out.println(Lee.equals(Lee3));
        System.out.println(System.identityHashCode(Lee));
        System.out.println(System.identityHashCode(Lee3));
    }
}
