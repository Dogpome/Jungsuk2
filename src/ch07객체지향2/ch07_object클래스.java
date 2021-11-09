package ch07객체지향2;

public class ch07_object클래스 {
    // 부모가 없는 클래스는 자동적으로 object 클래스를 상속 받게됨.
    // 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받게됨.
    // ex) ToString(), equals(Object obj) etc...
    // 따로 상속처리를 안해도 위에 ToString 같은 애들 사용가능.

    // class tv {              -> class Tv extends object {]
    // 부모가 없는 클래스임          ㄴ 컴파일러가 자동으로 object 상속함
    //}
    // class SmartTv extends Tv(부모있음) {
    // }

    //  상속 계층도
    //   object   1순위
    //     TV     2순위
    //   SmartTv  3순위
}