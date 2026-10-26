public class IveMember {
    static void main(String[] args) {
        String name = "가을";
        int age = 23;
        double height = 163.0;
        int 데뷔년도 = 2021;
        long 활동년수 = (2026-데뷔년도);
        String 성인여부 = (age >= 20) ? "성인" : "미성년자";

        System.out.println("=============================");
        System.out.println("IVE 멤버 카드");
        System.out.println("=============================");

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("활동년수 : " + 활동년수);
        System.out.println("성인여부 : " + 성인여부);


    }
}
