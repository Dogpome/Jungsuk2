package 혼자하는자바;

public class 입력된내용변수에저장 {
    public static void main(String[] args) throws Exception {
        int keyCode;


        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if (keyCode == 113) {
                break;
            }// 계속 입력할 수 있는 코드임
        }
        System.out.println("종료");
    }
}
