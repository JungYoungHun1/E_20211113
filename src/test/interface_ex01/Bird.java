package test.interface_ex01;

public class Bird implements Flyer{
    @Override
    public void takeoff() {
        System.out.println("새가 날아오르다");
    }

    @Override
    public void fly() {
        System.out.println("새가 날고 있습니다");
    }

    @Override
    public void land() {
        System.out.println("새가 앉았습니다");
    }
}
