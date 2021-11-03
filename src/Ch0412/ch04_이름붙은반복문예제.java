package Ch0412;

import java.util.Scanner;

public class ch04_이름붙은반복문예제 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

         // while문에 outer 이름부여
        outer : while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");

            String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp 에 저장.
            menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환.

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;

            }
        }

            } // while 문의 끝
        } // main 의 끝.


