package test.abstract_class01;

public class AbstractExtends extends AbstractClass{
    @Override
    void method01(){
        System.out.println("완성된 method");
    }

    public static void main(String[] args) {
        AbstractExtends ex = new AbstractExtends();
        ex.method01();
        ex.method2();
    }
}
