package 혼자하는자바;
// 조건문 조건식에 따라 실행문을 실행하기 위해 사용됨.
// true이냐 false 이냐에 따라 실행문이 결정됨.
public class 조건문if문 {

    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        } // 14줄 중괄호 17줄{}이 없다면 15번째까지만 연산함.
        // 그래서 등급은 B입니다가 출력됨, 그래서는 안되기 때문에
        // 14줄 중괄화 17중괄호를 넣어 완전한 식을 만들어 줌.
        // 중괄호를 안넣게되면 if 조건문 다음줄만 연산함.
    }
}

//            if (score >= 90) {
//                System.out.println("점수가 90보다 큽니다.");
//                System.out.println("등급은 A입니다.");
//            } else {
//                System.out.println("점수가 90보다 작습니다.");
//                System.out.println("등급은 B입니다.");
//            }
//        }
//    }
