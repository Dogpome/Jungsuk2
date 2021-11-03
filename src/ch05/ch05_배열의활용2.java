package ch05;

public class ch05_배열의활용2 {
    public static void main(String[] args) {
        // 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        // 변수 max, 변수 min을 사용함
        // max 값을 79로 선언
        // min 값을 79로 선언

        int max = score[0]; // 배열의 첫 번째 값(79)으로 최대값을 초기화 한다.
        int min = score[0]; // 배열의 첫 번째 값(79)으로 최소값을 초기화 한다.

        for(int i=1; i < score.length;i++) {
            // score.length 보다 낮을 때까지 반복한다.
            // i 를 0부터 시작하지 않는 이유 - 자기 자신 0과는 비교할 필요가 없기 때문
            // 1 부터 시작한다.

           if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        } // 포문 끝

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}
