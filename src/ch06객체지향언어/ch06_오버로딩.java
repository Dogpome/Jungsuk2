package ch06객체지향언어;

public class ch06_오버로딩 {
    // 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것.
    // 메서드와 메서드 이름이 1:1 매칭해야 작동하는 것이 원칙임.
    // n : 1 -- 오버로딩 과적하다.
    // 오버로딩의 대표적인 예는 println()
    // void println(boolean x)
    // void print(char x)
    // println(123);
    // println("ABC");
    // 자바는 오버로딩을 지원하기 때문에 한개로 여러가지 일을 할 수 있어.
    // 오버로딩을 지원하지 않는다면 이름이 다 달라야함.
    // ㄴ println str("abc"); 이렇게 진행이 될 것임.
    // 오버로딩을 지원하는 것은 상당한 장점이야

    // 6-30 오버로드 성립 조건.
    // 1. 메서드 이름이 같아야 한다
    // 2. 매개변수의 개수 또는 타입이 달라야 한다.
    // 3. 반환 타입은 영향없다.

    // 보기 1
    // int add(int a, int b) {return a+b;} -- 오버로딩 아님
    // int add(int x, int y) {return x+y;} -- 오버로딩 아님
    // ㄴ 같은 메서드를 두 번 정의 할 뿐.
    // add(int,int)is already defined

    // 보기 2
    // int add(int a, int b) {return a+b;} -- 오버로딩 아님
    // long add(int a, int b){return a+b;} -- 오버로딩 아님
    // ㄴㄴ 1번 매개변수 이름 동일, 2번 매개변수 개수 또는 타입같음.
    // 반환 타입인 int, long은 영ㅇ향 없어

    // 보기3
    // long add(int a, long b) {return a+b;} - 오버로딩임
    // long add(long a, int b) {return a+b;} - 오버로딩임
    // ㄴ 1번 타입 같음(add), 2번 매개변수 개수 타입 다름
    // 컴퓨터가 어떤 타입으로 출력해야하는지 모르니까 에러남
    // ambiguous




}
