package generic.ex01;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter printer = new ThreeDPrinter();

        Powder powder = new Powder();
        printer.setMaterial(powder);

        Powder p = (Powder)printer.getMaterial();
    }
}
