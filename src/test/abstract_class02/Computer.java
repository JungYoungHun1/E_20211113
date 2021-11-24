package test.abstract_class02;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("on");
    }
    public void turnOff(){
        System.out.println("off");
    }
}
