package javabasic;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
//      while
        int num = 1;
        int sum  = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
        System.out.println();


//      do-while
        Scanner scanner = new Scanner(System.in);
        int input;
        sum = 0;

        do {
            input = scanner.nextInt();
            sum += input;
        }while(input != 0);

        System.out.println(sum);
        System.out.println();


//      for
        int count = 1;
        sum = 0;

        for (int i = 0 ; i < 10; i++, count++) {  //10번
            sum += count;
            //count++;
        }
        System.out.println(sum);
        System.out.println();


//      다중 반복문
        int dan = 2;
        count = 1;

        for (dan = 2; dan <= 9; dan++) {
            for (count = 1; count <=9; count++) {
                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }

        dan = 2;
        while (dan <= 9 ) {
            count = 1;
            while (count <= 9) {
                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }


//      break
        sum = 0;
        int i;
        for (i = 1; ; i++) {
            sum += i;
            if (i >= 100) break;
        }
        System.out.println(sum);
        System.out.println(i);
        System.out.println();


//      continue
        for (i = 1; i <= 100; i++) {
            if ((i % 3) != 0) continue;
            System.out.println(i);
        }
    }
}
