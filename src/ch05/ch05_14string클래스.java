package ch05;

public class ch05_14string클래스 {
    // String클래스는 char[]와 매서드(기능)을 결합한 것.
    // String 클래스 = char[]+ 매서드(기능)

    //String클래스는 내용을 변경할 수 없다.(읽기 전용)

    //ch05-15
    // String클래스의 주요 매서드
    // char charAt(int index) -- 문자열에서 해당 위치에 있는 문자를 반환함
    // String str = "abcde"
    // char ch = str.charAt(#) // str의 4번째 문자 d를 ch에 저장
    // 내가 원하는 인덱스를 하나 추출하여 저장 가능

    // int length() -- str.length 하면 5가 나옴.

    // String substring(int from, int to)
    // ㄴ String str = "012345";
    // String tmp = str.substring(1~4); // str에서 index 범위 1~4 문자 반환
    // System.out.println(tmp) -- "123" 출력됨

    // boolean equlas. -- 문자열이 같은지 확인함 ,같으면 true 아니면 false.


}
