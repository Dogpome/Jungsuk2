package ch06객체지향언어;

public class ch_메서드오버로딩 {
    private int plus(int value1, int value2) {
        System.out.println("int plus1");
        return value1 + value2;
    }


    private int plus(int value1, int value2, int value3) {
        System.out.println("int plus2");
        return value1 + value2 + value3;
    }

    private float plus(float value1, float value2) {
        System.out.println("float plus");
        return (value1 + value2);
        // 이름은 같은데 타입이 다름
    }

    private int minus(int value1, int value2) {
        System.out.println(value1 - value2);
        return value1 - value2;
    }

    private int multiple(int value1, int value2){
        System.out.println(value1 * value2);
        return value1 * value2;
    }

    public static void main(String[] args) {
        ch_메서드오버로딩 ch_메서드오버로딩 = new ch_메서드오버로딩();
//        int r1 = ch_메서드오버로딩.plus(20, 20);
//        int r2 = ch_메서드오버로딩.minus(20, 30);
//        ch_메서드오버로딩.multiple(r1, r2);
//        System.out.println(ch_메서드오버로딩.plus(10,20));
        System.out.println(ch_메서드오버로딩.plus(1.8f,3.7f));
        System.out.println(ch_메서드오버로딩.plus(10,20));
        System.out.println(ch_메서드오버로딩.plus(10,20,30));
        // 뒤에 f를 안써주면 d타입이 됨.
        // 위에 것이 실행되는지

        // but 1.8과, 3.7을 더 하고 싶다.
        // 실수를 더 하려면 어떻게 할 것인디?
        // 이때 오버로딩을 사용한다.
        // 위에 정수 수식에 넣으면 에러가 남.

    }
}
