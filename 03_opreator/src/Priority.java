public class Priority {
    public static void main(String[] args) {

        // (1)
        System.out.println(2 + 3 * 4);       // 14

        // (2)
        System.out.println((2 + 3) * 4);     // 20

        // (3)
        System.out.println(10 - 2 + 3);      // 11

        // (4)
        int a = 5;
        System.out.println(a > 3 && a < 10); // true

        // (5)
        System.out.println(true || false && false); // t
        // 힌트: && 가 || 보다 우선순위가 높다
    }
}
