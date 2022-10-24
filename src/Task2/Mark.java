package Task2;

public class Mark {


    double getPercentage() {
        return 0;
    }
}
class StudentA extends Mark{
    double grade1;
    double grade2;
    double grade3;
    StudentA(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;}
    double getPercentage() {
        double percentage=(((grade1+grade2+grade3)/3));
        System.out.println("The average of student A is "+percentage);
        return percentage;
    }}
class StudentB extends Mark{
    double grade1;
    double grade2;
    double grade3;
    double grade4;
    StudentB(double grade1, double grade2, double grade3 ,double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }
    double getPercentage() {
        double percentage=(grade1+grade2+grade3+grade4)/4;
        System.out.println("The average of student B is "+percentage);
        return percentage;
    }
    public static void main(String[] args) {
        Mark[] grade={new StudentA(85,90,100 ),new StudentB(65,75,80,85)};
        for(int i=0;i< grade.length; i++){
            grade[i].getPercentage();
        }
    }
}


