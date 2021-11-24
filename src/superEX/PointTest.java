package superEX;
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x :"+x+", y :"+y;
    }
}
class Point3D extends Point{
    int z;
    Point3D(int x, int y, int z){
        super(x,y);
        this.x =x;
        this.y=y;
        this.z=z;
    }
    @Override
    String getLocation(){
        return "x :"+x+", y :"+y+", z : "+z;
    }
}
public class PointTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.getLocation());
    }
}
