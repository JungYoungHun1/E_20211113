package constructor.member;

public class MemberTest {
    public static void main(String[] args) {
        System.out.println("main() 메소드 실행");
        new Member();
        new Member("Amy");
        new Member("Amy", 23);
    }
}
