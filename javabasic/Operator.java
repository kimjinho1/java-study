package javabasic;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
//      관계 연산자
        int num1 = 5;
        int num2 = 3;

        boolean value = (num1 > num2);
        System.out.println(value);

        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println();


//      논리 연산자
        num1 = 10;
        num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 > 0) || (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag);

        flag = !(num1 > 0);
        System.out.println(flag);
        System.out.println();


//      조건 연산자
        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1:");
        int x = scanner.nextInt();
        System.out.println("입력2:");
        int y = scanner.nextInt();

        max = (x > y) ? x : y;
        System.out.println(max);
        System.out.println();


//      비트 연산자
        num1 = 5;  	// 00000101
        num2 = 10; 	// 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);
    }
}
