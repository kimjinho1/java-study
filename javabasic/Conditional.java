package javabasic;

//import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
//      if - else
        int age = 7;

        //Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        }
        else {
            System.out.println("학교에 다니지 않습니다.");
        }
        System.out.println();


//      if - else if - else
        age = 12;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        }
        else{
            charge = 3000;
            System.out.println("일반인 입니다.");
        }
        System.out.println("입장료는 " + charge + "원입니다.");
        System.out.println();


//      switch
        int month = 10;
        int day;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");
        }
        System.out.println(month + "월은 " + day + "일입니다.");
        System.out.println();


//      Java 14 이상부터 가능한 Switch Expression(,로 구분, yield 사용)
        month = 3;

        day = switch (month) {
            case 1, 3, 5, 7, 8, 10,12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4,6,9,11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 ->{
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };
        System.out.println(month + "월은 " + day + "일입니다.");
    }
}
