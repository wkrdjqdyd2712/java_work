import java.util.Scanner;


public class ch03 {
    static void main(String[] args) {
        //- 90 ~ 100점 → A
        //- 80 ~ 89점 → B
        //- 70 ~ 79점 → C
        //- 60 ~ 69점 → D
        //- 0 ~ 59점 → F

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("성적을 입력하세요");
            int score = sc.nextInt();
            String grade;
            if (score>=90) {
                grade = "A";
            } else if (score>=80) {
                grade = "B";
            } else if (score>=70) {
                grade = "C";
            } else if (score>=60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("성적 : "+grade);
        }
    }
}
