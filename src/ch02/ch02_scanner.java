package ch02;

import java.util.*; // import 문 추가해야 화면으로부터 입력 받을 수 있어.

public class ch02_scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num);


    }
}
