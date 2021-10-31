public class COUNTER {
    public static void main(String[] args) {
     String str = "3";

        System.out.println(str.charAt(0)-'0'); // 문자열을 문자(3)로 변경 charAt 사용
        // ㄴ 숫자 3아니라 문자 3임
        System.out.println('3'-'0'+1); // 숫자인걸 확인하려고 +1 한 것 값 4 나옴
        System.out.println(3+1);
        System.out.println("3"+"1");
        System.out.println((char)(3+'0'));  // '0' 은 숫자 48임
    }
}
