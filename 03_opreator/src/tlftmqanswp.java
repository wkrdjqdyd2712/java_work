public class tlftmqanswp {
    static void main(String[] args) {
        //1.
        int a = 10;
        a = a += 3;
        System.out.println(a);
        a = a += 2;
        System.out.println(a);  // 15

        // 2.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        // 3.
        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        // 4.
        System.out.println(10>5 && 3<1); //f
        System.out.println(10>5 || 3<1); //t
        System.out.println(!(10>5)); //f

        // 5.
        int score = 75;
        String grade = (score >= 80) ? "합격" : "불합격";
        System.out.println(grade); //불
    }
}
