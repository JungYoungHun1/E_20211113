package test.interface_ex01;

public class FlyUse {
    public static void main(String[] args) {
        Airplane plane = new Airplane();
        plane.takeoff();
        plane.fly();
        plane.land();


        Bird bird = new Bird();
        bird.takeoff();
        bird.fly();
        bird.land();

    }
}
