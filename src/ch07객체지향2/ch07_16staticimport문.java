package ch07객체지향2;


import static java.lang.Math.PI;
import static java.lang.Math.random;

public class ch07_16staticimport문 {
    // static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.

    // import static java.lang.Integer.*; / Integer클래스의 모든 static메서드
    // import static java.lang.Math.random; // Math.random()만 괄호 안붙임.
    // import static java.lang.System.out  // System.out을 out만으로 참조가능

    // -> out.println(random()); 임포트 스테틱문 사용하면 좀 더 간결한 코드로 사용가능.
    // 앞에 클래스 이름만 생략됨.

    public static void main(String[] args) {
        System.out.println(PI); // sout(pi) 이렇게하고 알트엔터치니까 임포트문 자동완성됨.
        System.out.println(random());

        // 클래스 이름 쓰면 코드가 너무 길어지니까 간결하게 하라고 이렇게 씀
        // 꼭 필요할 때만 써라.


    }

}
