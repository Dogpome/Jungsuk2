package ch06객체지향언어;

public class ch06_6객체의생성과사용2 {
    // Tv t; // 변수를 선언한다는 것임, 타입이 Tv(기본형타입아님, 참조형 변수)
    // Tv <- 이게 리모컨임
    // t = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장.
    // new Tv -- 객체를 생성했음.

    // t.channel = 7; -- 리모컨 t가 가르키는 채널을 7로 지정 -- 변수 사용용
   // t.channelDown(); -- 매서드 채널다운을 호출함. -- 매서드 호출

    // class Tv { 설계도 생성 단계
    //
    //     // 제품 생성 단계 -- 변수 아래 3개 선언
    //    // string color: // 색깔
    //    // boolean power; // 전원상태
    //    // int channel; // 채널
    //
    //    // 매서드 사용 -- 메서드 3개
    //    // void power() {power = !power; }
    //    // void channelUp() { channel++;}
    //    // void channelDown() {channel--;
    //
    //    // 총 6개 맴버

    // 객체를 생성하고 사용하려면 이렇게 해야한다는 것만 알아두시오.
    // 매서드 호출 = 매서드 사용




}
