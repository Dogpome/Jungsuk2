package ch02;

public class ch02_varex3 {
    public static void main(String[] args) {
        final int score = 100;
        // score = 200;

        boolean power = true;
        byte b = 127; // byte 타입음 1-127 까지만 허용 정수

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16

        long l = 20_000_000l;

        float f = 3.14f; // f는 생략하면 안된다. 에러남.
        double d = 3.14; // d 생략 가능함 안써줘도 됨.
        System.out.println(oct);
        System.out.println(hex);
    }
}
