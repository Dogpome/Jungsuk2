package 혼자하는자바;

public class 문자열변환 {
    public static void main(String[] args) {
        // 문자열을 숫자로 변경하는 작업
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " +value1);
        System.out.println("value2: " +value2);
        System.out.println("value3: " +value3);

        // 기본타입을 문자열로 변경하는 작업
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);


    }
}
