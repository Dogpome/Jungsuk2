package ch05;

public class ch05_배열길이예제 {
    public static void main(String[] args) {
        int[] arr = new int[9]; // 길이가 9인 int배열 arr 생성함.
        System.out.println("arr.length="+arr.length);

        // 배열의 모든 요소를 출력하려면? for 문사용하라

      //  for(int i=0; i<10;i++) {
        //    System.out.println("arr["+i+"]"+arr[i]);

            // 범위를 벗어나면 에러가 뜨니까.
            // length 명령어를 써주는 것임.
        // for문 조건식에 length 를 써주면 에러 날 일 이 없음

        for(int i=0; i<arr.length;i++) {
                System.out.println("arr["+i+"]"+arr[i]);
        }
    }
}
