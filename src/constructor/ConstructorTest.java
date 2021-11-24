package constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
//      Data2 data2 = new Data2();
        Data2 data3 = new Data2(10);

    }
}
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }
}
