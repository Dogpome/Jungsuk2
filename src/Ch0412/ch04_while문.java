package Ch0412;

public class ch04_while문 {
    //조건을 만족시키는 동안 블럭{}을 반복함 - 반복횟수 모를 때(for문,while문 두개가 반복문전부)
    // if문과 같음
    // while (조건식) {  } -- 조건식 연산이 참인동안 반복될 문장들을 적음.

    // while (조건식)
    // 조건식을 조사해서 참이면 계속 반복되다 거짓이면 반복을 벗어난다.
    // 조건식이 처음부터 거짓이면 괄호 안 문장들은 수행 되지 않아.
    // while 문과 for문은 언제나 변경 가능

    public static void main(String[] args) {
        int i = 1; // 초기화

        while (i <= 10) { // 조건식
            System.out.println(i);
            i++; // 증감식  // 포문이 더 간결함
        }
    }
}
