package ifCondiction;

import java.util.Scanner;

public class MenuSelect {
    static void main(String[] args) {
        //커피: 1,500원
        // 주스: 1,000원
        // 물: 500원
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 넣으세요");
        int money = scanner.nextInt();
        String result;
        if (money >= 1500 ) {
            result = ("커피, 주스, 물 모두 구매 가능합니다.");
        } else if (money >= 1000) {
            result = ("주스, 물 구매 가능합니다.");
        } else if (money >= 500) {
            result = ("물만 구매 가능합니다.");
        } else {
            result =("잔액이 부족합니다.");
        }
        System.out.println(result);
        System.out.println("이용해 주셔서 감사합니다.");
    }
}
