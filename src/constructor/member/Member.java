package constructor.member;

public class Member {
    String name;
    int age;

    Member(){
        System.out.println("Member() 생성자 실행");
    }
    Member(String name){
        System.out.println("Member(String) 생성자 실행");
        System.out.println(name);
    }
    Member(String name, int age){
        System.out.println("Member(String, int) 생성자 실행");
        System.out.println(name + ", " + age);
    }
}
