package overriding.override02;

class Parent{
    void display(){
        System.out.println("부모 클래스");
    }
}
class Child extends Parent {
    @Override
    void display(){
        System.out.println("자식 클래스");
    }
    void display(String str){
        System.out.println(str);
    }
}
public class OverridingTest2 {
    public static void main(String[] args) {
        Child ch = new Child();

        ch.display();
        ch.display("오버로딩 display");
    }
}
