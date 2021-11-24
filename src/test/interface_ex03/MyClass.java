package test.interface_ex03;

public class MyClass implements MyInterface{
    @Override
    public void mymethod() {
        System.out.println("mymethod");
    }

    @Override
    public void x() {
        System.out.println("x");
    }

    @Override
    public void y() {
        System.out.println("Y");
    }
}
