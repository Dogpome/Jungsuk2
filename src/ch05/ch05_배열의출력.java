package ch05;

import java.util.Arrays;

public class ch05_배열의출력 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};
        System.out.println(iArr); // [I@14318bb] 와 같은 문자열이 출력됨.
        // ㄴ 위처럼 하면 배열의 모든 값이 나오지 않아.
        // [ <- 배열을 의미,I <- 인티저값을 뜻함
        // 배열 이름을 출력하는 것만으로는 안돼.
        // char[] (chArr) = ('a','b','c')
        // System.out.println(chArr); <- char 변수에 한정해서
        // 모든 배열의 요소가 출력됨.
        // 그래서 for 문을 사용해서 출력한다
        for(int i= 0;i < iArr.length; i++) {
            System.out.println(iArr);
            System.out.println(Arrays.toString(iArr));

            // tosTring 배열의 내용을 문자열로 바꿔준다.
            // Arrays.toString 한줄로 나오니까 많이 쓴다.

        }
    }

}
