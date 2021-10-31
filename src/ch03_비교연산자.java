public class ch03_비교연산자 {
    // 두 피연ㅅ나자를 비교해서 true 또는 false를 반환
    // > 좌변이크면 true 아니면 false
    // < 좌변이작으면 true 아니면 false
    // >= 좌변 값이 크거나 같으면 true 아니면 false
    // <= 좌변 값이 작거나 같으면 true 아니면 false

    // == 두 값이 같으면 true 아니면 false (= 하나만 쓰는 것을 주의하라)
    // != 두 값이 다르면 true 아니면 false

    // 'A' > 'B' -> 65 > 66 -> false 나옴
    // 인티저보다 적은 값은 인티저로 계산됨.

    // 3-14 문자열의 비교 방법
    // 숫자아닌 문자의 비교에는 == 대신 equals()를 사용해야함.

    // 1번 방법
    // String str1 = "abc";
    // String str2 = "abc";
    // System.out.println(str1==str2); // true
    // System.out.println(str1.equals(str2)); // true

    // 2번 방법
    // String str1 = new String("abc");
    // String str2 = new String("abc");
    // System.out.println(str1==str2); // false
    // System.out.println(str1.equals(str2)); // ture


}
