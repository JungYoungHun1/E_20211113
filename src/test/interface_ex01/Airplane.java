package test.interface_ex01;

public class Airplane implements Flyer{

    @Override
    public void takeoff() {
        System.out.println("비행기 이륙");
    }

    @Override
    public void fly() {
        System.out.println("비행기 비행");
    }

    @Override
    public void land() {
        System.out.println("비행기 착륙");
    }
}
