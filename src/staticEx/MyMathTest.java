package staticEx;

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.add(200L, 100L));
        System.out.println(MyMath.sub(200L, 100L));
        System.out.println(MyMath.mul(200L, 100L));
        System.out.println(MyMath.div(200L, 100L));

        MyMath math = new MyMath();
        math.a=200L;
        math.b=100L;

        System.out.println(math.add());
        System.out.println(math.sub());
        System.out.println(math.mul());
        System.out.println(math.div());
    }
}
