package ch06객체지향언어;

public class ch06_클래스의정의 {
    // 클래스란 무엇인가?
    // 1. 설계도 -- 객체지향에서
    // 2. 데이터와 함수의 결합
    // 3. 사용자 정의타입.

    // 클래스 == 데이터 + 함수 라는 관점에서 설명하겟음

    // 1. 변수 == 하나의 데이터를 저장할 수 있는 공간
    // 2. 배열 == 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
    // 배열의 한계는 같은 종류만 저장할 수 있다는 것.
    // 3. 구조체 == 서로 관련된 여러 데이터(종류상관없이)를 하나로 저장할 수 있는 공간.
    // 실수, 문자, 인트 타입 등 다른 타입이라도 관계가 있으면 묶을 수 있어.
    // 4. 클래스 == 데이터와 함수의 결합(구조체 + 함수)
    // 구조체와 함수를 묶은 것임 -- 변수(데이터)와 서로관련있는 함수(메서드)
    // 클래스 == 명령문 묶음
    // 함수 == 어떤 작업을 계산하려면 어떤 대상을 가지고 작업을 해야지.
    // 그 데이터(변수)를 가지고 작업함.

    // 사용자 정의 타입 -- 원하는 타입을 직접 만들 수 있다. 관점으로 설명
    // int hour;
    // int minute;    --- 클래스로 만들면 Time t = new Time();
    // int second;     --- 묶어서 다루니 코드가 간결해짐,
    // int hour1, hour2, hour3;
    // int minute1, minute2. minute3;   --- Time t1 = new Time();
    // int second1, second2, second3;   --- Time t2 = new Time();
    // int[] hour = new int[3];         --- --- Time t3 = new Time();
    // int[] minute = new minute[3];
    // int[] second = new second[3];

    // 이렇게 만들면 각자 자기 타입이랑만 섞임, 시간은 시간, 분은 분, 초는 초 끼리만 묶ㅇㅁ.
    // 하지만
    // class Time {
    // int hour;
    // int minute;
    // int second;
    // }
    // 이렇게 만들면 위에 저 긴 코드를 짧게 만들 수 있음

    // 클래스의 정의 2
    // int hour = 12;                  == Time t = new Time();
    // int minute = 34;                ===  t.hour = 12;
    // int second = 56;                ===  t.minute = 34;
    // ㄴ이 코드는 비객체 지향코드    ===   t.second = 56;  -- 객체지향적 코드


}
