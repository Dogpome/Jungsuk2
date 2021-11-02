package ch05;

public class ch05_배열의초기화 {
    // 배열의 각 요소에 처음으로 값을 저장하는 것.
    // 배열을 왜 만드는데? 값을 저장하려고.
    public static void main(String[] args) {

        int[] score = new int[5]; // 길이가 5인 int 배열 생성선언
        // 0~4까지 생성됨.
        // 배열 요소에 무언가 값을 부여하는 행위를 초기화라 부름
        // int 값은 0이 기본값임
        // 초기화가 안되면 말이 안됨.

        // 1번 방법 for 문으로 초기화를 많이 해줌
        // for(int i=0; i< score.length; i++)
        // score[i] i * 10 + 50;

        // 2번 방법 int[] score = new int[]{50,60,70,80,90};
        // 3번 방법 int[] score = {50, 60, 70, 80, 90};
        // 3번 new int 생략가능

        // 3번 방법을 거의 90퍼센트로 함
        // 4번 방법
        // int[] score;
        // score = {50,60,70,80,90}; // 에러남 new int[] 생략 불가능
        // 두줄로 나누는건 안됨

        score[0] = 50;
        score[1] = 60;
        score[2] = 70;
        score[3] = 80;
        score[4] = 90;
    }
}
