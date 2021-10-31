package Ch0412;

import java.util.Scanner;

public class ch04_dowhile문 {
    // do-while문
    // 블럭{}을 최소한 한 번 이상 반복 - 사용자 입력받을 때 유용

    // do {  } // 조건식의 연산결과가 참일 때 수행될 문장들을적는다
    //(처음 한 번은 무조건 실행)
    // do {  } while (조건식); < - 끝에 ;을 잊지 않도록 주의

    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        // 1~100 사이의 무작위 값 추출
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input!=answer);
        System.out.println("정답입니다.");
    }

}
