package thisEx;

public class ThisTest01 {
    String name;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    public static void main(String[] args){
        ThisTest01 exam = new ThisTest01();
        exam.setName("Amy");
        System.out.println(exam.getName());
    }
}
