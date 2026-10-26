public class VendingMachine {
    static void main(String[] args) {
        String 음료 = "아이브 에너지드링크";
        int 가격 = 1500;
        int 투입금액 = 2000;
        String 자판기;
        System.out.println("=============================");
        System.out.println("자판기");
        System.out.println("=============================");
        System.out.println("음료 : " + 음료);
        System.out.println("가격 : " + 가격);
        System.out.println("투입금액 : " + 투입금액);
        String status = (투입금액 >= 가격) ? "구매가능" : "구매불가";
        System.out.println("구매가능 : " + status);
        long 거스름돈 = (투입금액 - 가격);
        System.out.println("거스름돈 : "+ 거스름돈);
        System.out.println("=============================");
    }
}
