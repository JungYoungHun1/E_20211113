package point;

public class pointTest {
    public static void main(String[] args) {
        point p1 = new point();
        p1.setKor(77);
        p1.setEng(66);
        p1.setMat(55);
        p1.setName("김철수");

        p1.print();

        point p2 = new point("이영희",30,90,23);
        p2.print();
    }
}
