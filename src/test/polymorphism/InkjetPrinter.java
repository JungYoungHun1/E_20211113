package test.polymorphism;

public class InkjetPrinter extends Printer {
    @Override
    public void print(){
        System.out.println("잉크젯 프린터 인쇄");
    }
}
