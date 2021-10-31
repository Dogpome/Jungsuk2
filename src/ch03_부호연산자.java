public class ch03_부호연산자 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // + 해봐야 변하는거 없음
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    }
}
