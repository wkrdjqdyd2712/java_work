import java.util.Scanner;

public class cho6 {
    static void main(String[] args) {
        //주사위 3개의 눈을 입력받아 상금을 계산하시오.
        //- 세 눈이 모두 같으면: 10,000 + 같은 눈 × 1,000원
        //- 두 눈이 같으면: 1,000 + 같은 눈 × 100원
        //- 모두 다르면: 가장 큰 눈 × 100원
        Scanner sc = new Scanner(System.in);

        System.out.println("주사위1 a:");
        int a = sc.nextInt();
        System.out.println("주사위2 b:");
        int b = sc.nextInt();
        System.out.println("주사위3 c:");
        int c = sc.nextInt();

        int prize = 0;

        if (a == b && b == c) {
            prize = 10000 + (a * 1000);
        } else if (a == b || a == c || b == c) {
            // 같은 눈 찾기
            if (a==b) {
                prize = 1000 + a * 100;
            } else if (b == c) {
                prize = 1000 + b * 100;
            } else {
                prize = 1000 + c * 100;
            }
            // 가장 큰 눈 찾기
        } else {
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            prize = max * 100;
        }
        System.out.println("상금 : " + prize + " 원");
        }


        }

        //System.out.println("상금 : " + reslut + "원");


