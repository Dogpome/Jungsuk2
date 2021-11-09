package ch06객체지향언어;

class ch06_testclass {
    void instanceMethod() {} // 인스턴스메서드
    static void staticMethod() {} // static메서드

    void instanceMethod2() {
        instanceMethod(); // 다른 인스턴스메서드 호출 가능
        staticMethod(); // 스태틱 메서드 호출 가능(항상ok)
    }

    static void staticMethod2() {
       // instanceMethod(); // 에러남 인스턴스메서드를 스테틱에서못써
        staticMethod(); // static메서드 호출 가능

            // 스태틱 메서드가 인스턴스 메서드 호출이 안된다는 것만 알아라
        }
   }

