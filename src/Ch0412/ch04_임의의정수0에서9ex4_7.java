package Ch0412;

public class ch04_임의의정수0에서9ex4_7 {
    public static void main(String[] args) {
        int num = 0;
        // 0~9사이의 정수 50개를 출력 하시오
        for (int i = 1; i  <= 50; i++){
            num = (int) (Math.random()*10);
            // 포문은 반복문 괄호 안 내용을 20번 반복한다는 뜻.
            System.out.println(num);
            // 동영상 강의 link random : https://www.youtube.com/watch?v=OPXM_2lagLA&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=35
        }
    }
}
