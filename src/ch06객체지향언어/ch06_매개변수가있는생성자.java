package ch06객체지향언어;

class  Car {
    String color; // 색상
    String gearType; // 변속기 종료 -- auto, manual
    int door; // 문의 개수

    Car() {} // 기본 생성자
    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g; // 변속기 종료 -- auto, manual
        door = d; // 문의 개수

        // 한 번만 작성해놓으면 다음 사람이 편함
        // 여러줄 써놓을 것을 한 줄로 사용 가능.
        // 생성자는 일 편하자고 하는 것임.

        // Car c = new Car("white", "auto",4);
        //        new연산자가 객체를 생성함 칼라, 기어타입, 도어
        //                만들어진 객체를 초기화(값 지정)

    }


}
