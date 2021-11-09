package ch07객체지향2;

public class ch07_8오버라이딩조건 {
    // 1. 선언부가 조상 클래스의 메서드와 일치해야함.
    // 2. 접근제어자를 조상 클래스의 매서드보다 좁은 범위로 변경불가.
    // [public, protected, defalt, private]
    // 이 네 가지 접근제어자 중 더 낮은 단계의 접근제어자로 못가
    // 3. 예외는 조상 메서드 보다 많이 선언할 수 없음
    //    ㄴ 8장에서 배울거임 예외는는    // class Point {
    // int x;
    // int y;
    // String getLocation() {
    // return "x :"+ x + ", y :"+ y;
    //    }
    // }
    // class Point {
    //    // int z;
    // tring getLocation() {
    // return "x :"+ x + ", y :"+ y;
    // ㄴ 위에 여기를 오버라이딩함
    // String getLocation() <- 여기가 선언부임
    // 반환타입,매서드이름,매개변수목록 전부 동일해야해.
}
