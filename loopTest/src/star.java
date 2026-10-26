public class star {
    static void main(String[] args) {
        //배열 변수 선언하기, 배열이름은 복수형
        int[] scrores = {75, 10, 53, 35};
        //3번째 값 출력 : 50
        System.out.println("3번째 배열" + scrores[2]);
        scrores[1] = 0;
        System.out.println("2번째 배열" + scrores[1]);
        //전체 배열 내용 순회하면서 출력
        for (int i = 0; i < scrores.length; i++) {
            System.out.println(scrores[i]);
        }
        // 문자 배열 만들기
        String[] members = {"장원영", "안유진", "가을"};
        for (int i = 0; i > members.length; i++) {
            if (i < members.length - 1) {
                System.out.println(members[i] + ",");
            } else {
                System.out.println(members[i]);
            }


        }
    }
}