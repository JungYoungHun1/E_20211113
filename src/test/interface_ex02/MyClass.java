package test.interface_ex02;

public class MyClass implements X, Y {


    @Override
    public void x() {
        System.out.println("x");
    }

    @Override
    public void y() {
        System.out.println("y");
    }

    public void mymethod() {
        System.out.println("my method");
    }
}
