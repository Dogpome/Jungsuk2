package 혼자하는자바;

public class 조건문ifelse문 {
    public static void main(String[] args) {
        int score = 85;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("A 등급입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("B 등급입니다.");
        } // else문 옆에 (score<90) 이 붙은거임. 자동으로 조건문의 정반대 조건이 붙게됨.
    }
}
