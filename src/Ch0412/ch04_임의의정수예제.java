package Ch0412;

public class ch04_임의의정수예제 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Hello");
        // 괄호{} 안의 내용을 20번 반복한다.
        for (int i = 1; i <= 20; i++){
            // 포문은 반복문 괄호 안 내용을 20번 반복한다는 뜻.
            System.out.println(Math.random());
        }
    }
}
