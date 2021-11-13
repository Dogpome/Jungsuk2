package ch8;

public class ch08_4예외처리하기 {
    // 예외처리의 정의
    // 1. 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것.
    // 2. 프그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것.

    // try-catch 문 사용.

    // try { } <- 예외가 발생할 가능성이 있는 문장을 넣음.
    // catch (Exception1 e1) { } <- 예외 발생 상황 1

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // <-- 예외발생!!
            System.out.println(4);  // 트라이블럭전체넘어 캐치블럭으로감.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println("ArithmeticException");
            }
        }
        catch (Exception e) {
            System.out.println(5);
        } // try-catch 끝
        System.out.println(6);
    }
}
