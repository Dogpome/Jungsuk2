package 혼자하는자바;

public class 삼항연산자 {
    public static void main(String[] args) {
        // 3개의 피연산자를 필요로 하는 연산자를 삼항 연산자라고 부름.
        // ? 앞의 조건식에 따라 : 뒤에 피연산자가 선택되는 조건 연산식임.
        // a -참값-> b = 참 출력
        // a -거짓값->c = 거짓 출력

        // if 문으로 연산할 수 도 있음

        int score = 85;
        char grade = (score >90) ? 'A' : ( (score> 80) ? 'B' : 'C');
        // 엑셀 if함수라고 할 때 ?뒤에 참값 : 뒤에 거짓값 (엑셀에서 쉼표, 기능이 인텔리제이에서 : 값임)
        System.out.println(score + "점은" + grade + "등급입니다.");

//        int socre = 95;
//        char grade2;
//        if(socre >90) {
//            grade2 = 'A';
//        }else  {
//            grade2 = 'B';
//        }
//        System.out.println(score +"점은" + grade2 + "등급입니다.");
    }
}
