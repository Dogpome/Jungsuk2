package Ch0412;

public class ch04_구구단 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.println(i+"단을 출력합니다");
            for (int x = 1; x <= 9; x++) {
                if (i%3==0) // 3,6,9 단 안나옴.
                    continue;
                System.out.println(i+"x"+i+"="+i*x);// 중첩포문까지 한거임.

            }

        }
    }
}
