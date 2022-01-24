package string.builder;

// StringBuilder
// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다
// 단일 쓰레드라면 StringBuilder, 멀티 쓰레드라면 StringBuffer의 사용을 권장한다
// StringBuffer는 동기화(synchronization)를 보장함
// toString() 메서드로 String 반환
public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append("android");
        System.out.println(System.identityHashCode(buffer));

        java = buffer.toString();
        System.out.println(buffer);
        System.out.println(java);
    }
}
