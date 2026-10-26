import java.util.Scanner;

public class exT2 {
    static void main(String[] args) {
        //두 수를 a와 b에 입력 받은 후
        //두 수를 출력하고
        //두 수를 바꾸어 다시 출력하시오
        //첫번째 수 입력 : 3
        //두번째 수 입력 : 4
        System.out.println("a 와, b 에 각각 숫자를 넣으시오");
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        int a = sc.nextInt();

        System.out.println("b = ");

        int b = sc.nextInt();


        System.out.println("a = "+b);
        System.out.println("b = "+a);
    }
}
