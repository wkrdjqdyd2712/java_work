import cafe.Cafe;

public class Main {
    static void main(String[] args) {

        System.out.println("===== 자바카페 =====");

        String name = "김자바";
        int age = 20;
        boolean member = true; //회원여부
        String grade = "S"; //등급
        long coin = 20000;  //지갑
        long stamp = 8; // 스탬프
        long friend = 0; // 함께 온 친구

        System.out.println("고객 : " + name + " / 나이" + age + " / 회원 : " + member + " / 등급 : " + grade);

        //주문번호 현재 200
        //현재번호 받고 기계번호1증가

        int countNumber = 200;
        int nextCN = countNumber+1;

        String pickupZone = (countNumber % 2 == 0) ? "픽업대 A에서 받아가세요" : "픽업대 A에서 받아가세요";
        System.out.println(pickupZone);

        System.out.println("내 주문번호 : " + countNumber + " 다음 주문번호 : " + nextCN);

        // 메리카노(4,500원) 2잔과 케이크(6,800원) 1개를 주문합니다
        // 주문 수와 판매 잔 수를 늘리고, 주문 금액을 계산하세요

        Cafe.orderCount++;
        Cafe.cupCount +=3;
        int aa = 2; //아아
        int aaPrice = 4500;
        int cake = 1; //케잌
        int cakePrice = 6800;

        long bill = (aaPrice * aa) + (cakePrice * cake); // 주문금액
        System.out.println("주문 금액 : " + bill);

        //회원이면 할인율만큼 할인하고, 아니면 할인하지 않습니다. 원 단위 미만은 버립니다
        //결제 금액을 지갑에서 빼고, 남은 돈을 거스름돈으로 출력하세요.

        long discount = (long)(bill * Cafe.SALE_RATE); // 할인금액
        System.out.println("할인 금액 : " + discount);

        long payment = (bill - discount);  // 결제금액
        System.out.println("결제 금액 : " + (bill - discount));

        //회원이면 할인율만큼 할인하고, 아니면 할인하지 않습니다. 원 단위 미만은 버립니다
        //결제 금액을 지갑에서 빼고, 남은 돈을 거스름돈으로 출력하세요.

        long changeMoney = (coin - payment);
        System.out.println("거스름돈 : "+ changeMoney);

        long count_1000 = changeMoney/1000;
        changeMoney = changeMoney%1000;
        long count_100 = changeMoney/100;
        changeMoney = changeMoney%100;
        long count_10 = changeMoney/10;
        changeMoney = changeMoney%10;

        String result = "천원" + count_1000 + "개, ";
        result = result + "백원" + count_100 + "개, ";
        result = result + "십원" + count_10 + "개, ";
        result = result + "남은 금액 " + changeMoney + "원";
        System.out.println(result);

        stamp += aa;
        System.out.println("스탬프 : " + stamp);
        //무료 음료 쿠폰: 회원이고 스탬프가 10개 이상인 경우
        boolean freeCoupon = (member && stamp >=10);
        String couponFree = freeCoupon ? "true" : "false";
        System.out.println("무료 음료 쿠폰 : " + couponFree);

        //더치페이 대상: 함께 온 친구가 0명이 아니고, 결제 금액을 친구 수로 나눈 값이 5,000원 이상인 경
        //친구가 0명인데도 0으로 나누기 에러가 나지 않는 이유를 주석으로 설명하세요
        boolean isDutchPay = (friend != 0) && ((payment / friend) >= 5000);
        String dutchResult = isDutchPay ? "true" : "false";
        System.out.println("더치페이 대상 : " + dutchResult);

        //두 번째 손님이 아메리카노 1잔을 주문했습니다. 오늘의 주문 수와 판매 잔 수를 출력하세요.
        Cafe.orderCount++;
        Cafe.cupCount++;
        System.out.println("오늘의 주문 : "+Cafe.orderCount+", 판매 잔 수 : "+Cafe.cupCount);
    }
}