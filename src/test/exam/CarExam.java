package test.exam;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car("소나타", "2020년형", "파란색") {
            @Override
            void run() {

            }
        };
        System.out.println(car.getName());
        System.out.println(car.getYear());
        System.out.println(car.getColor());
    }
}
