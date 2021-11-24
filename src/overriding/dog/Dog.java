package overriding.dog;

public class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("멍멍");
    }
}
