package student;

public class StudentUse {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("코리아");
        student01.setMajor("국문");
        student01.setYear("3학년");
        student01.setNum("21789222");
        student01.setPoint("3.4");

        Student student02 = new Student("정영훈", "컴공", "4학년", "21629016", "4.5");

        student01.print();
        student02.print();
    }
}
