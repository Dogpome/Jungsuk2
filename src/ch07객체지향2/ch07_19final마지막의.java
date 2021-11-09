package ch07객체지향2;

public class ch07_19final마지막의 {
    // final 제어자

    // 1. 클래스 사용시
    // 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
    // 때문에 다른 클래스의 조상이 될 수 없어.

    // 2. 매서드 사용시
    // 변결될 수 없음 오버라이딩 재정의 불가능.

    // 3. 맴버변수, 지역변수 사용시
    // 변수 앞에 final이 붙으면, 값을 변경할수 없는 상수가 됨.

    // final class FinalTest { <- 조상이 될 수 없는 클래스
    // final int MAX_SIZE = 10; <-- 변수앞에 붙었음 상수화됨

    // final void getMaxSize() { // 오버라이드 불가 메서드가됨.
    //   final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수(상수)
    // return MAX_SIZE;

}
