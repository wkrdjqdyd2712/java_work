import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        // 두 수를 입력받아서 두 수사이의 값을 모두 더한다.
        // 1. 스캐너 달기
        Scanner sc = new Scanner(System.in);
        // 2. 두 수를 입력받는다.(a,b 정수)
        System.out.println("1번수 : ");
        int a = sc.nextInt();
        System.out.println("2번수 : ");
        int b = sc.nextInt();
        // 3. 두 수를 비교해서 a > b : 두 수를 바꾼다.
        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // 4. for loop로 누적합을 계산한다.
        int sum = 0;
        for (int i = a; i <= b; a++) {
            sum = sum + i;
        }
        // 5. 결과를 출력한다.
        System.out.println("결과 : " + sum);
    }
}
