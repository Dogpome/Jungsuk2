package ch8;

public class error {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(-1/0);
        } catch (ArithmeticException ae) {
            System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(3);
    }
}
