package 혼자하는자바;

public class 논리부정연산자 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play; // 위에 변수를 재할당 했음 그러니까 위에서 play값에 !play가 저장된것임 ㅋㅋ 때문에 play = !play임
                    // !play = !play 연산이 성립함, 참값임.
        System.out.println(play);
    }
}
