package test.polymorphism;

public class PrinterUse {
    public static void main(String[] args) {
        Printer p = new DotPrinter();
        p.print();

        p = new InkjetPrinter();
        p.print();

        p = new LaserPrinter();
        p.print();
    }
}
