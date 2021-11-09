package ch06객체지향언어;

 class ch06_28 {
    // static을 언제 붙여야 할까?
    // 속성(멤버 변수) 중에서 공통 속성에 붙임.

    // 개별속성 iv
    // 공통속성 static 붙임. -- 메서드(명령문집합)

     int iv;        // 인스턴스 변수 {객체 생성후 사용가능}
     static int cv; // 클래스 변수 {언제나 사용가능}

     void instanceMethod() {    // 인스턴스 메서드 생성
         System.out.println(iv); // 인스턴스 메서드 변수 사용됨
         System.out.println(cv); // 클래스 변수라 사용 가능
     }
     static void saticMethod () {  // 스태틱 메서드
       //      System.out.println(iv);    // 인스턴스 변수 못씀
             System.out.println(cv);    // 클래스 변수사용가능.
         }
 }

