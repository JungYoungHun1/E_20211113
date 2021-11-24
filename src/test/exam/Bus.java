package test.exam;

public class Bus extends Car{


    void board(){
        System.out.println("승객을 태우다");
    }
    void takeOff(){
        System.out.println("승객을 내리다");
    }
    void run(){
        System.out.println("버스가 달린다");
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setName("840");
        bus.setYear("2002");
        bus.setColor("blue");

        System.out.println(bus.getName());
        System.out.println(bus.getYear());
        System.out.println(bus.getColor());
        bus.board();
        bus.takeOff();
        bus.run();
    }
}
