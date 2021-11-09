package ch07객체지향2;

public class ch07_36인터페이스의상속 {
    // 인터페이스의 조상은 인터페이스만 가능(object가 최상위 조상 아님)
    // 다중 상속 가능(조상이 여러개인거)

    // interface Fightable extends Movable, Attackable {}
    //          인터페이스 다중상속됨   1번상속, 2번상속
    //     인터페이스는 추상메서드 집합이라 가능, 충돌할게 없음.
    // 다중 상속 충돌해도 문제 없음.)

    // interface Movable {
    // void move(int x, int y);
    // }

    // interface Attackable {
    // void attack(Unit u);
    // }
}
