package string.ex;

// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다(메모리 낭비 발생)
public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
