package 혼자하는자바;

public class 문자열결합연산자 {
    public static void main(String[] args) {
        String str1 = "JDK" + 6.0;
        String str2 = str1 + "특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";

        System.out.println(str3);
        System.out.println(str4);

        String strVar1 = "신용권";
        String strVar2 = "신용권";
        System.out.println(strVar1.equals(strVar2)); // 문자열 비교는 == 사용하지않아 .equals를 사용한다.
        System.out.println(!strVar1.equals(strVar2));
    }
}
