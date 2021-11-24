package thisEx;

public class ThisTest02 {
    int i = 1;

    void first(){
        int i = 2;
        int j = 3;
        this.i = i+j;
        System.out.println("first()의 i : " + this.i);
        second(4);
    }
    void second(int i){
        int j = 5;
        this.i = i+j;
        System.out.println("second()의 i : " + this.i);
    }
    public static void main(String[] args){
        ThisTest02 exam = new ThisTest02();
        exam.first();
    }
}
