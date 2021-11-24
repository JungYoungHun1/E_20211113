package test.polymorphism;

public class LaserPrinter extends Printer {
    @Override
    public void print(){
        System.out.println("레이저 프린터 인쇄");
    }
}
