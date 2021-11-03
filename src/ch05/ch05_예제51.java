package ch05;

import java.util.Arrays;

public class ch05_예제51 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] ChArr = {'a','b','c','d'};

        for (int i=0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] = i + 1); // 1~10의 숫자를 순서대로 배열
            }

        for (int i=0; i< iArr2.length; i++) {
            System.out.println();

            System.out.println(Arrays.toString(iArr2));
        }
    }
}
