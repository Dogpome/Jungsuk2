package ch07객체지향2;

public class ch07_35인터페이스 {
    // 인터페이스란 무엇인가? => 추상 메서드의 집합
    // 인터페이스란? 구현된 것이 전혀 하나도 없는 설계도임.(추상메서드의 집합이기 때문)
    // 모든 멤버가 public임.
    // 추상클래스와 인터페이스의 차이가 뭔데?
    // 추상클래스 -> 추상 클래스인데 추상 메서드를 가지고 있음.[일부 미완성]
    // 인터페이스 -> 가지고 있는 것이 아무 것도 없음.[완전 미완성]

    // interface 인터페이스이름 {
    // public static final 타입 상수이름 = 값; <- 상수
    // public abstract 메서드이름(매개변수목록); <- 추상매서드
    // }

    // 인터페이스의 모든 멤버는 예외없이 public임.
    // 예외없이 모두 추상메서드(abstract)

    // ex
    // interface PlayingCard {
    // Public static final int SPADE = 4;
    // final int DIAMOND = 3; // public static final int HEART = 2;
    // static int HEART  = 2; //  퍼블릭 스태틱 파이널 생략 가능
    // int CLOVER = 1;

    // public abstract String getCardNumber();
    // String getCardkind(); // public abstract String getCardKind();
    // } ㄴ public abstract는 생략가능, 인터페이스는 항상
    // 상수든 스태틱이든 뭐든 다 생략 가능
}
