package ch06객체지향언어;

public class ch06_6객체의생성과사용 {
    // 1. 객체의 생성
    // 클래스명 변수명;         // 클래스의 객체를 참조하기 위한 참조변수를 선언
    // 변수명 = new 클래스명(); // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

    // Tv t; // Tv클래스 타입의 참조변수[리모컨] t를 선언
    // tv = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장

    // Tv t; -- t는 참조변수 즉 리모컨임 tv를 다루려면 필요한 것.
    // t = new Tv(); -- 객체를 생성한 후로 리모컨으로 연결해줌.
    // 리모컨이 없으면 객체를 다룰 수 있는 방법이 없다.

    // Tv t = new Tv()

    // 2. 객체의 사용
    // t.channel = 7; // Tv인스턴스의 맴버변수 channel의 값을 7로 한다.
    // t.channelDown(); // Tv인스턴스의 메서드 channelDown() 호출함.
    // System.out.println("현재 채널은 " + t.channel + " 입니다.");

    // 객체지향 만드는 순서
    //  // 클래스 작성(설계도 생성)
    // tv제품 만들고
    // 메서드를 사용하여 사용한다.

    // class Tv { 설계도 생성 단계

     // 제품 생성 단계 -- 변수 아래 3개 선언
    // string color: // 색깔
    // boolean power; // 전원상태
    // int channel; // 채널

    // 매서드 사용 -- 메서드 3개
    // void power() {power = !power; }
    // void channelUp() { channel++;}
    // void channelDown() {channel--;

    // 총 6개 맴버
}





