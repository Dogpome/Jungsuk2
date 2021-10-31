public class ch02_varex4 {
    public static void main(String[] args) {
        int x = 4, y = 2;
        int tmp;

        tmp = x; // x의 값을 tmp에 저장
        x = y; // y의 값을 x에 저장
        y = tmp; // tmp의 값을 y에 저장.
        System.out.println("x="+x); // x앞 +는 더하는거아님 숫자앞 글자를 붙인다는 것.
        System.out.println("y="+y);

    }
}
