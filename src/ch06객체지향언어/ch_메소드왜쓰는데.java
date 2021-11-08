package ch06객체지향언어;

public class ch_메소드왜쓰는데 {
    private int plus(int value1, int value2) {
        System.out.println(value1 + value2);
        return value1 + value2;
    }

    private int minus(int value1, int value2){
        System.out.println(value1 - value2);
        return value1 - value2;
    }
    // 이미 계산된 함수를 가지고 또 다른 수를 구하고 싶기 때문에
    // 아래에 새로운 메서드를 만들 것이야.
    // void는 비어있다는 뜻임, 때문에 리턴값이 없다.
    // 때문에 private int plus(int value1, int value2)
    // return value1 + value2;
    // void는 출력하고 끝내버리기 때문에 return 값이 없다는 뜻이다.


    private int multiple(int value1, int value2){
        System.out.println(value1 * value2);
        return value1 * value2;
    }

   public static void main(String[] args) {
        ch_메소드왜쓰는데 ch_메소드왜쓰는데 = new ch_메소드왜쓰는데();
        int r1 = ch_메소드왜쓰는데.plus(20,20);
        int r2 = ch_메소드왜쓰는데.minus(20,30);
        ch_메소드왜쓰는데.multiple(r1,r2);

        // 리턴값을 안써주면 함수의 연산결과를 다른 곳에서 불러 쓸 수 없어.
        // void는 그 메서드에서 끝내는 명령어임.



    }
}
