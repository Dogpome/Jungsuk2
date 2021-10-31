package ch02;

public class ch02_varex5 {
    public static void main(String[] args) {
        System.out.printf("%d%n", 15); // 10진수
        System.out.printf("%o%n", 15); // 8진수
        System.out.printf("%x%n", 15); // 16진수
        System.out.printf("%s%n", 15); Integer.toBinaryString(15); // 1111 2진수
        // 아래는 8진수 16진수 접두사 붙이는 방법 지자 앞에 # 붙여

        System.out.printf("%#o", 15); // 017
        System.out.printf("%#x", 15); // 0xf
        System.out.printf("%x", 15); // oxf

        // 아래 실수 출력을 위한 지시자 %f
        // float 타입은 정밀도 7자리임.

        float f = 123.456789f;
        System.out.printf("%f", f); // 123.456787  소수점 여섯자리까지 나옴
        System.out.printf("%e", f); // 1.234568e+02 지수형식

        // 실제로 저장된 값은 같은데 지수형식은 반올림된 값임.
        // printf는 줄바꿈이 안됨. 뒤에 기획문자 %n을 넣어주면 줄바꿈 해줌 ex %e%n

        //printf()지시자
        System.out.printf("[%5d]%n", 10); // 지시자 5d 앞 숫자 5 다섯자리 출력[1234510]
        // 출력할 내용이 두 자리 밖에 안되어 10 만 출력됨.
        System.out.printf("[%-5d]%n", 10); // [10   ] -붙이면 왼쪽정렬임
        System.out.printf("[%05d]%n", 10); // [00010] 빈공간에 0으로 채움.



    }
}
