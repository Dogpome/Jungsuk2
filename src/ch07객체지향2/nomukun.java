package ch07객체지향2;

class InheritanceTest  { // 부모가 없으니 extends object 됨 컴파일러가 자동으로 놓어줌
    int x ;
    int y ;
}

// 상속처리
//class Circle extends InheritanceTest { // 상속
//    int r;
//}

// 포함처리
class Circle {
    InheritanceTest p = new InheritanceTest();
    int r;
}

public class nomukun {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.p.x = 1;
//        c.p.y = 2;
//        c.r = 3;
//        System.out.println("c.p.x="+c.p.x);
//        System.out.println("c.p.y="+c.p.y);
//        System.out.println("c.r="+c.r);
        System.out.println(c.toString());
        System.out.println(c);
        // ㄴ 프린트엘엔 디폴트가 스트링으로 출력하는 기능이 있음.
                    // 위에 c에는 상속받은게 없지만
                    // object 클래스가 컴파일러에 의해
                    // 자동상속되었기 때문에 사용 가능한 것.

    }
}