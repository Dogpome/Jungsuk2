package Ch0412;

public class ch04_contiune문 {
    // 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
    // 특정 조건을 만족할 때 조건을 수행하지않음.
    // 전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용

    public static void main(String[] args) {
        for(int i=0; i<=10;i++) {
            if(i%3==0)
                // 3의 배수, 3으로 나누어떨어졌을 때 조건식을 실행하지 않고 넘어가

                continue;
            System.out.println(i);
        }
    }
}
