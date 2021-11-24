package thisEx.person2;

import thisEx.person.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = new Person("홍길동", 23);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
