package test.exam;

public abstract class Car {
    private String name;
    private String year;
    private String color;

    Car(){}

    abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Car(String name, String year, String color){
        this.name = name;
        this.year = year;
        this.color = color;
    }
}
