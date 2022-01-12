package function;

// 함수
public class Function {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calsSum() {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        int res = addNum(n1, n2);
        System.out.println(res);

        sayHello("Jinho");

        int sum = calsSum();
        System.out.println(sum);
    }
}
