package bank;

import bank.setting.bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== 자바은행 =====");

        // 운영에 필요한 변수 선언하기
        int costomer =1; //고객번호
        String name = "홍길동";
        int age = 25;
        boolean vip = false;
        String grade = "B";
        long balance = 0; //잔액
        long salary = 0; // 급여

        // Step 3. 첫 손님 등장

        System.out.println("고객번호 : "+costomer + " / 이름 : " + name + " / 나이 : " + age + " / 등급 : " + vip);

        // Step 4. 번호표 뽑기
        // 현재번호 : 100, 현재 고객이 뽑으면 1증가

        int machinTicket = 100;
        int customerTicket = machinTicket++;

        System.out.println("고객번호표 : " + +customerTicket + ", 다음 대기 번호 : " + machinTicket);

        String counter = (customerTicket % 2) == 0 ? "1번 창구" : "2번 창구";
        System.out.println("안내 : " + counter + "로 오세요");

        // Step 5. 입금출금

        long deposit = 50000;
        long balance1 = balance + deposit;

        System.out.println("입금 후 잔액 : " + balance1);

        long withdrawal = 12000;
        long balance2 = balance1 - withdrawal;

        System.out.println("출금 후 잔액 : " + withdrawal);

        // Step. 7 대출 상담
        // 현재 잔액에 이자율을 곱해서 이자를 계산
        // 원 단위 미만은 버리고 정수, 잔액 + 이자(이것도 거래건수증가)

        //## STEP 7. 대출 상담
        //
        //- 대출 가능: 나이가 19세 이상이고 잔액이 30,000원 이상

        // 홍길동 고객님은 월급이 0원입니다. 프로그램이 0으로 나누기 에러 없이 동작하도록 작성하고, 그 이유를 주석으로 설명하세요.
        boolean loanOk = (age >= 19) && (balance1 >= 3000);
        System.out.println("대출 가능 : " + loanOk);
        //- 우대 대상: 월급이 0이 아니고, 잔액이 월급의 2배 이상
        boolean isSpeial = salary != 0 && (balance2 / salary >= 2);
        System.out.println("우대 대상 : " + isSpeial);

        // Step. 8
        // 현재 잔액을 만원권, 천원권, 백원 동전으로 몇 개씩 줄 수 있는지 계산하고, 남은 금액도 출력하세요.
        // 잔액 : balance2  381110
        long count_10000 = balance2 / 10000; // 몫
        balance2 = balance2 % 10000;
        long count_1000 = balance2 / 1000; // 몫
        balance2 = balance2 % 1000;
        long count_100 = balance2 % 100;
        balance2 = balance2 % 100;

        String result = "만원권" + count_10000 + "장, ";
        result = result+ "천원권" + count_10000 + "장, ";
        result = result+ "백원권" + count_100 + "개, ";
        result = result + "남은 금액" + balance + "원";
        System.out.println(result);

        bank.guestCount++;
        String output = "오늘의 총 고객 수 : ";
        output = output + bank.guestCount + "명, ";
        output = output + "거래 건수" + bank.guestCount + "명, ";
        System.out.println(output);
    }
}
