package constructor.person;

public class Person {
    String name;
    float height;
    float weight;

    Person(){}
    Person(String name){
        this.name = name;
    }
    Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
