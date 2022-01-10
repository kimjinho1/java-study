package static_method;

// static method
// 인스턴스 생성 전에 호출될 수도 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없다.

// - 지역(로컬) 변수 -> 함수 내부 선언 -> 함수 내부 사용 -> 스택 -> 함수 호출 때 생성되고 함수 끝나면 소멸
// - 멤버(인스턴스) 변수 -> 클래스 멤버 변수로 선언 -> 클래스 내부 사용, private이 아니면 참조 변수로
//   다른 클래스에서도 사용 가능 -> 힙 -> 인스턴스 생성될 때 생성되고, 가비지 컬랙터가 메모리를 수거할 때 소멸
// - static(클래스) 변수 -> static 예약어를 사용하여 클래스 내부 선언 -> 클래스 내부 사용, private이 아니면 클래스 이름으로
//   다른 클래스에서 사용 가능 -> 데이터 영역 -> 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고
//   프로그램이 끝나고 메모리를 해제할 때 소멸
public class StaticMethod {
    public static void main(String[] args) {
        static_variable.Employee employeeK = new static_variable.Employee();
        employeeK.setEmployeeName("김진호");

        System.out.println(Employee.getSerialNum());

        static_variable.Employee employeeS = new static_variable.Employee();
        employeeS.setEmployeeName("신현수");

        System.out.println(employeeK.getEmployeeName() + ", " + employeeK.getEmployeeId());
        System.out.println(employeeS.getEmployeeName() + ", " + employeeS.getEmployeeId());
    }
}
