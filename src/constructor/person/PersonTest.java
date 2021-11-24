package constructor.person;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight=85.5f;
        personKim.height=180.0f;
        Person personLee = new Person("이순신", 175, 75);
        System.out.println(personKim.name);
        System.out.println(personKim.weight);
        System.out.println(personKim.height);

        System.out.println(personLee.name);
        System.out.println(personLee.weight);
        System.out.println(personLee.height);
    }
}
