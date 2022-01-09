package datatype;

// 데이터 타입
public class DataType {

    public static void main(String[] args) {
//		정수
        int n = 1;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;

        byte bnum = -128;
        long lNum = 1234567890L;

        System.out.println(n);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);
        System.out.println(bnum);
        System.out.println(lNum);
        System.out.println();


//		실수
        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println(dnum);
        System.out.println(fnum);
        System.out.println();

//		부동 소수점 방식의 오류 -> 지수부가 0을 표현할 수가 없어서 약간의 오차가 발생할 수 있다
        double dnum2 = 1;

        for(int i = 0; i<10000; i++) {
            dnum2 = dnum2 + 0.1;
        }
        System.out.println(dnum2);
        System.out.println();


//		문자
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        int ch2 = 67;
        System.out.println(ch2);
        System.out.println((char)ch2);

        char ch3 = '한';
        char ch4 = '\uD55C';

        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println();


//		논리형
        boolean isTrue = true;
        System.out.println(isTrue);
        System.out.println();


//		지역 변수 자료형 없이 사용하기
        var i = 1;
        var j = 1.23;
        var str = "Hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
//		str = 1;
    }
}