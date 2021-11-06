package ch05;

public class ch_string예제 {
    public static void main(String[] args) {
        String str = "ABCDE";
        /// C만 뽑아오자
        char ch = str.charAt(0);
        System.out.println(ch); // 0을적으면 a 1적으면 b 이렇게 나온다. 지정된 인덱스출력
        String str2 = str.substring(1,4); // BCD가 출력됨
        System.out.println(str2); // BCD -- A와 D 사이에 문자가 추출되는 것이야.
        String str3 = str.substring(1,5);
        System.out.println(str3);
        System.out.println(str.substring(1,str.length()));

    }
}
