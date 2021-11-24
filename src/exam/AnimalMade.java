package exam;

public class AnimalMade {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name ="dog";
        dog.height=30.5;
        dog.weight=20.7;
        dog.color="black";
        dog.age=3;
        System.out.println(dog.name);
        System.out.println(dog.height);
        System.out.println(dog.color);
        System.out.println(dog.running(200));

    }
}
