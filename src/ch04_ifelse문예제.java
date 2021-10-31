import java.util.Scanner;

public class ch04_ifelse문예제 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 초기화하기

        System.out.print("점수를 입력하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장
        // 아니 시발 근데 화면을 통해 뭘 받는다는건데.

        if (score >=90) {
            grade = 'A'; // 90점이거나 더크면 A 출력
        } else if (score >=80) {
            grade = 'B'; // 80점과 같거나 더 크면 B 출력
        } else if (score >=70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은"+ grade +"입니다");

    }
}
