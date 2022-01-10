package static_variable;

// static 변수
// 여러 인스턴스에서 공통으로 사용 가능 EX) 사번, 학번, 카드 번호
public class StaticVariable {
    public static void main(String[] args) {
        Employee employeeK = new Employee();
        employeeK.setEmployeeName("김진호");

        Employee employeeS = new Employee();
        employeeS.setEmployeeName("신현수");

        System.out.println(employeeK.getEmployeeName() + ", " + employeeK.getEmployeeId());
        System.out.println(employeeS.getEmployeeName() + ", " + employeeS.getEmployeeId());
    }
}
