package javabasic;

public class TypeConversion {

    public static void main(String[] args) {
//		바이트 크기가 작은 자료형에서 큰 자로형으로 형 변환은 자동으로 이루어 짐
//		덜 정밀한 자료형에서 더 정밀한 자로형으로 형 변환은 자동으로 이루어 짐

//		자동
        byte bNum = 10;
        System.out.println(bNum);
        System.out.println((int)bNum);

        int iNum = 20;
        System.out.println(iNum);
        System.out.println((float)iNum);
        System.out.println();

//		강제
        int iNum2 = 10;
        System.out.println(iNum2);
        System.out.println((byte)iNum2);

        double dNum = 3.14;
        System.out.println(dNum);
        System.out.println((int)dNum);
        System.out.println();


//		연산 중 형 변환
        double dNum2 = 1.2;
        float fNum = 0.9F;

        System.out.println((int)dNum2 + (int)fNum);
        System.out.println((int)(dNum2 + fNum));
    }
}
