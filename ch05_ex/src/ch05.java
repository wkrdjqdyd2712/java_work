import java.util.Scanner;

public class ch05 {
    static void main(String[] args) {
        //H(0~23), M(0~59), C(0~1000) 입력
        //분이 60 이상이 되면 시간 올림 처리
        //23시 59분 + 1분 = 0시 0분 (24시간 순환)
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("현재 시간(시)을 입력하세요(0~23) h:");
            int h = sc.nextInt();
            System.out.println("현재 시간(분)을 입력하세요(0~59) m:");
            int m = sc.nextInt();
            System.out.println("요리 시간(분)을 입력하세요(0~1000) c:");
            int c = sc.nextInt();

            // 현재 시각 + 입력 받은 시각을 분을 더한다.
            int total = h * 60 + m + c; // 시간 * 60 + 분 + 요리 분
            // 다시 시각으로 변환한다.
            // 1. 시간 변환
            int resultH = (total / 60) % 24; // 0~23시 추출
            // 2. 분 으로 나누기
            int resultM = total % 60; // 분 남기기
            System.out.println(resultH + "시 " + resultM + " 분");
            }

        }


    }
