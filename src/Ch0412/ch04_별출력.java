package Ch0412;

public class ch04_별출력 {
    public static void main(String[] args) {
        // *을 총 다섯가지를 계단식으로 출력해야한다,
        // i 대신 1을 넣으면 1 2 3 4 5 로 출력이 됨.
        // 이걸 * 한 개, ** 두 개
        // for문은 문자식으로는 작동을 안한다.
        for (int y = 0; y <= 5; y++) {
            for (int i = 1; i <= y; i++) {
                System.out.print("*");  // 주어진 '변수계를' 반복하는 것이야.
            }
            System.out.println();
        }
    }
}

