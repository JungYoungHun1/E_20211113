package overriding.override01;


class Parent{
    void display(){
        System.out.println("부모 클래스");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("자식 클래스");
    }
        }
public class OverridingTest1 {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.display();

        Child ch = new Child();
        ch.display();
    }
}
