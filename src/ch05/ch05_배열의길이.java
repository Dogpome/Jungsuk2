package ch05;

public class ch05_배열의길이 {
    // 배열이름.length - 배열의 길이(int형 상수)
    public static void main(String[] args) {
        int[] arr = new int[5]; // 길이가 5인 int 배열
        int tmp = arr.length; // arr.length의 값은 5이고 tmp에 5가 저장된다.
        // 배열은 한번 생성하면 실행동안 그 길이를 바꿀 수 없음
        // 배열 길이는 상수임[값이 안바뀜]
        // 길이를 왜 못 바꾼는데?, 부족하면 어떻게하는데.

        // 못바꾸는 이유 -- 내가 지정한 메모리 옆 공간이 비어있는지 모르기 때문.

        //int[] score = new int[6];

       // for (int i =0; i < 6; i++)
           // System.out.println(score[i]); // 에러발생 - 인덱스 범위 넘어섬

        int[] score = new int[5]; /// 배열 길이를 6에서 5로 변경

        for (int i =0; i < score.length; i++)
            System.out.println(score[i]); // 이렇게하면 조건식을 안바꿔도 에러없음.
        //
    }
}
