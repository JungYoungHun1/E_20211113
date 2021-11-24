package student;

public class Student {
    private String name;
    private String major;
    private String year;
    private String num;
    private String point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    Student(){}
    Student(String name, String major, String year, String num, String point){
        this.name = name;
        this.major = major;
        this.year = year;
        this.num = num;
        this.point = point;
    }
    public void print(){
        System.out.println("이름\t\t전공\t학년\t\t학번\t\t\t학점");
        System.out.println(name + "\t" + major + "\t" + year + "\t" + num + "\t" + point);
    }
}
