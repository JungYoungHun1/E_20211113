package point;

public class point {
    private int score;
    private int iboard;
    private String writer;
    private double avg;
    private String grade;
    private int total;
    private int kor;
    private int eng;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    private int mat;


    public int getTotal() {
        total = kor+eng+mat;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        avg = total/3.0;
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getGrade() {
        if(avg>=90){
            grade="수";
        }else if(avg>=80){
            grade="우";
        }else if(avg>=70){
            grade="미";
        }else if(avg>=60){
            grade="양";
        }else{
            grade="가";
        }
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    public void print(){
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t등급");
        System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+getTotal()+"\t"+getAvg()+"\t"+getGrade());
    }
    point(String name, int kor, int eng, int mat){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    point(){}
}
