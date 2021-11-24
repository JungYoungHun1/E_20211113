package superEX;
class Car{
    int wheel;
    int speed;
    String color;
    Car(String color){
        this.color = color;
    }
}
class SportsCar extends Car{
    int speedLimit;

    SportsCar(String color, int speedLimit){
        super(color);
        this.speedLimit = speedLimit;
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar("red", 330);
        System.out.println(sc.color);
        System.out.println(sc.speedLimit);
    }
}
