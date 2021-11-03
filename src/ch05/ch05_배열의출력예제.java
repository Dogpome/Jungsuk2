package ch05;

import java.util.Arrays;

public class ch05_배열의출력예제 {
    public static void main(String[] args) {
        int[] iArr = {100,95,80,70,60}; // 길이가 5인 int배열
        // System.out.println(iArr);
        for (int i = 0; i < iArr.length; i++) {
           System.out.println(iArr[i]);
            System.out.println(Arrays.toString(iArr));
            System.out.println();

            // Arrays 문을 쓰려면 import 문이 있어야해
            // ctrl+shift+o 자동으로 import 문 추가
        }
    }
}
