package ch07객체지향2;

public class ch07_importstatic {
    // import 문
    // 클래스를 사용할 때 패키지이름을 생략할 수 있다.
    // 컴파일러에게 클래스가 속한 패키지를 알려준다.

    // 1. import문 없을 때
    // class importTst {
    // java.util.Date today = new java.util.Date();

    // 2. import문 있을 때
    // import java.util.date;
    // class importTest {
    // Date today = new Date();
    // }

    // 자바.유틸이 사라짐(임포트문으로 생략이 됨.
    // 생략하는 쪽이 편하니까 이 기능을 사용 하는 것이다.
    // 인텔리제이는 alt+enter 로 생성할 수 있어.

    // 원래는 import 문이 위에 있어야하는데
    // 기본형 java.lang에서 대부분 사용할 수 있기 때문에
    // 굳이 넣어주지 않은 것임.
    // 클래스이름 앞에 패키지 이름 다 넣어줘야하는데
    // 임포트문이 있으니까 안쓰는 거임.

}
