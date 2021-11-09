package ch07객체지향2;

public class ch07_37인터페이스구현 {
    // 인터페이스에 정의된 추상 메서드 완성하는 것을 구현이라함.
    // class 클래스이름 implements 인터페이스이름 {
    // } 인터페이스에 정의된 추상메서드를 모두 구현해야한다.

    // class Fighter implements Fightable {
    // public void move(int x, int y) {  }
    // public void attack(Unit u)
    // }
    // 파이터 클래스는 fightable 인터페이스를 구현했다 이야기함.

    // implements 키워드를 쓴다는 것에만 차이가 있음.

    // 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함.
    // abstract class Fighter implements Fightable
    // public void move(int x, int y) { }
    // }
    // ㄴ 두 개 중 하나만 구현임.
    // 인터페이스를 구현한다는 것은? 추상클래스를 완성한다는 것이야.

}
