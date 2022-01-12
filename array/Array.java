package array;

// 배열 -> 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
public class Array {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int sum = 0;

        for (int i=0, num=1; i<arr.length; i++, num++) {
            arr[i] = num;
        }

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


//      배열의 길이와 요소의 개수는 동일하지 않음
//        double[] dArr = new double[5];
//        double mtotal = 1;
//        dArr[0] = 1.1;
//        dArr[1] = 2.1;
//        dArr[2] = 3.1;
//
//        for(int i = 0; i< dArr.length; i++) {
//            mtotal *= dArr[i];
//        }
//
//        System.out.println(mtotal);

        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for (int i = 0; i<count; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);
        System.out.println();


//      문자 배열
//        char[] alpahbets = new char[26];
//        char ch = 'A';
//
//        for (int i = 0; i<alpahbets.length; i++) {
//            alpahbets[i] = ch++;
//        }
//
//        for (int i = 0; i<alpahbets.length; i++) {
//            System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
//        }


//      향상된 for문
        char[] alpahbets = new char[26];
        char ch = 'A';

        for (int i = 0; i<alpahbets.length; i++) {
            alpahbets[i] = ch++;
        }

        for (char alpha : alpahbets) {
            System.out.println(alpha +","+ (int)alpha);
        }
    }
}
