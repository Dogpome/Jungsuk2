package 혼자하는자바;

import java.util.Scanner;

public class 스캐너문 {

    public static void main(String[] args) throws Exception {
        // System.in.read()는 키코드를 하나만 읽을 수 있음.
        // 문자열 두 개 이상 인식하기 위하여스캐너 클래스를 사용함.
        Scanner scanner = new Scanner(System.in);
        // 스캐너타입 선언, 스캐너 변수 선언, 생성된 scanner 변수에 입력장치로부터 입력받는 scanner를 선언함.
        String inputData;

        while (true) {
            inputData = scanner.nextLine();
            // scanner.nextLine(); -- 엔터키가 입력되기 전까지 대기상태로 만드는 매서드.
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }
    }
}
