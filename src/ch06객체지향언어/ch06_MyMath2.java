package ch06객체지향언어;

class MyMath2 {

    public static void main(String[] args) {
        System.out.println(MyMath2.add(200l,100l));
                        // 클래스이름
                        // 객체 생성 없이 호출 가능(스테틱메서드)
        // 스테틱메서드를 쓸것인지 인스턴스 메서드를 쓸것인지
        // 어떻게 판단 할 것이냐?
        // 언제 스테틱을 쓸 것인지? iv(인스턴스메서드)안쓸때 씀.


        MyMath2 mm = new MyMath2(); // 인스턴스 생성

        // 인스턴스 메서드는 객체를 먼저 생성하고 인스턴스 메서드를 호출
        // 객체란 iv의 묶음일 뿐이다. = 변수 묶음
        // 인스턴스 메서드는 iv로 작업하는거임. 그러니까 필요하지.

        mm.a = 200l; // <- 인스턴스 메서드 1
        mm.b = 100l; // <- 인스턴스 메서드 2
        System.out.println(mm.add()); // 인스턴스 메서드 호출
    }
    // 인스턴스 메서드
    // 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
    // 인스턴스 맴버(iv,im)와 관련된 작업을 하는 메서드
    // 메서드 내에서 인스턴스 변수(iv) 사용가능.

    // static 메서드(클래스메서드)
    // 객체생성하지 않고 클래스이름.메서드이름()으로 호출.
    // ex) Math.random() -- 객체 생성 안함.
    // ex) Math.round().
    // 메서드 내에서 인스턴스 변수(iv) 사용불가.
    // 인스턴스 맴버와 관련없는 작업을 하는 메서드.
    // 이 두 메서드의 차이 = iv를 사용하느냐 안하느냐에 차이임.

    long a, b;

    long add() {  // 인스턴스 변수 iv를 사용하는 메서드
        return a + b;
    }

    static long add(long a, long b) {
        //클래스메서드(static메서드) d
        // a와 b는 지역변수임,
        // 자기 작업에 필요한 변수를 매개변수로 받음.
        // 위에 long a, long b
        return a+ b;



    }

}
