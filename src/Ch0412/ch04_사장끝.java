package Ch0412;

public class ch04_사장끝 {
    // switch 종결문
    // 자신이 포함된 하나의 반복문을 벗어난다.
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // 언제 100이 넘을지 모르니까 특정 조건을 만족하면 브레이크하게
        while (true) { // while문은 true 무조건넣음 생략안됨.
            // 무한 반복문 for(;;) <- 요렇게하면 똑같음 와일과{}
            // for(;true;) <- 이렇게 써도 돼.
            if(sum > 100)
                break; // 자신이 속한 하나의 반복문을 벗어난다
            ++i;
            sum += i;
            // 특정 조건이되면 브레이 문으로 빠져나오기
        }
        System.out.println("i=" +i);
        System.out.println("sum=" + sum);
    }
}
