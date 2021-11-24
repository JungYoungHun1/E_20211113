package test.animal;

public class Animal {
    String name;
    int age;

    void breath(){

    }
    void run(){

    }
    void sound(String name){

    }
}
class Dog extends Animal{

    @Override
    void sound(String name){
        System.out.println(name+"는 멍멍");
    }
}
class Cat extends Animal{

    @Override
    void sound(String name){
        System.out.println(name+"는 야옹");
    }
}
class Tiger extends Animal{
    @Override
    void sound(String name){
        System.out.println(name+"는 어흥");
    }
}
