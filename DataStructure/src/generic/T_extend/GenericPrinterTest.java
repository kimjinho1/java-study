package generic.T_extend;

// <T extends 클래스>
// T 자료형의 범위를 제한 할 수 있음
public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);

//      상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용가능
//	    GenericPrinter powderPrinter2 = new GenericPrinter();
//		powderPrinter2.setMaterial(new Powder());
//		Powder powder2 = (Powder)powderPrinter2.getMaterial();
//		System.out.println(powderPrinter2);
    }
}
