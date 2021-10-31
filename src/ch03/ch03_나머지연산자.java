package ch03;

public class ch03_나머지연산자 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);

        // 나머지 연산자 %
        // 오른쪽 피연산자로 나누고 남은 나머지를 반환
        // 나누는 피연산자는 0이 아닌 정수만 허용(부호는 무시됨)

        // 위에 출력문 해석 10을 8로 나누면
        // 몫은 1이고, 나머지는 2입니다.


    }
}
