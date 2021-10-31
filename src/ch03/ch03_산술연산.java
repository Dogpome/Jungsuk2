package ch03;

public class ch03_산술연산 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        long c =(long) a * b; /// a * b는 2,000,000,000,000 ?

        System.out.println(c);
        // long 에 저장하려고 했더니 음수가 나옴.
        // 형변환 (long)을 해줘도 음수나옴. 애초에 값이 틀려버린 것임.
        // a나 b를 형변환 해줘야해 상단처럼 (long)a 이렇게 해주면 제대로 나옴.
        // 형변환 없이 계산하면 인티저 타입으로 저장되기 때문에 오버플로우 발생
        // 때문에 음수로 기록되는 것이다.
        // long c = 2000000000000L; 이렇게 되는 것임

    }
}
