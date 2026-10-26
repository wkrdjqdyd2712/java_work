import java.util.Scanner;

public class ch04 {
    static void main(String[] args) {
        // H(0~23), M(0~59) 을 각각 입력받는다
        // 45분을 빼되, 분이 음수가 되면 시간도 1 감소
        // 시가 음수가 되면 23시로 처리 (자정 처리)
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("시간을 입력하세요(0~23) h:");
            int h = sc.nextInt();

            System.out.println("분을 입력하세요(0~59) m:");
            int m = sc.nextInt();

            if (m >= 45) {
                m = m - 45;
                h = h;
            }
            if (m < 45) {
                m = m - 45 + 60;
                h = h - 1;
            }
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + "시" + m+"분");

        }
    }
}
