package thisEx.person;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Person(){
        this("이름없음", 1);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
