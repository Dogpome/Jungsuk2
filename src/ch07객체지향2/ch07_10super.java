package ch07객체지향2;

public class ch07_10super {
    // 참조변수 super
    // 객체 자신을 가르키는 참조변수.
    // 인스턴스 메서드나 생성자 내에서만 존재
    // 조상 멤버를 자신의 멤버와 구별할 때 사용.

    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
// 이름이 겹칠 때는 super(조상)와 this(자손)로 구별함
// 맴버를 구별 할 때만 사용하는 것임.


class Parent {int x = 10; /* super.x */}

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
