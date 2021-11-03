package ch05;

public class ch05_배열의활용 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];

        }
        average = sum / (float) score.length;
        // 형변환 해줘야 소수점 값이나옴.

        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }
}

