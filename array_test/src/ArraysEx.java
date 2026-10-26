import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;

public class ArraysEx {
    static void main(String[] args) {
        // scores 배열 선언 : 85, 92, 78, 95, 88, 90
        int[] scores = {85, 92, 78, 95, 88, 90};
        // scores 배열의 값을 하나씩 for 루프를 이용해서 출력
        for (int x : scores){
            System.out.println(x);
        }
        // scores 배열 전체 한방에 출력하기
        System.out.println(Arrays.toString(scores)); //[I@f6f4d33 : 객채를 식별하는 값
        // 가장 큰 값 찾기
        int other;
        //int max = Arrays.stream(scores).max()
        System.out.println("큰 값 : " + Arrays.stream(scores).max());
        //배열 정렬해보기
        Arrays.sort(scores); // 원복을 직접 수정해서 정렬 -> 원본 수정
        System.out.println("오름 차순 정렬 후 : "+ Arrays.toString(scores));
        // 일반적으로 객체가 갖는 기능
        // 정렬, 찾기, 가장 큰 값, 작은 값, 출력하기, 복사하기
        // 배열 복사하기
        // 새로운 배열 선언하고 거기에 복사
        int[] copyScores = Arrays.copyOf(scores,scores.length);
        // 복사한 배열을 출력
        System.out.println(Arrays.toString(copyScores));
    }
}
