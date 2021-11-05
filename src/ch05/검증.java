package ch05;

public class 검증 {
    public static void main(String[] args) {
        // 1~44 랜덤한 값을 출력할 것임.
        // 이 랜덤한 값 중에 44가 안나오는 것 같아.
        // 44까지 나오는지 확인 할 것이야.
        // 어떻게 검증 할 것인지?
        // 44보다 작다는 것을 알았음
        // 5000번 반복해서 나온 값이 뭔지 알아봐

        // math.random 값이 45까지 나오는지 알고 싶다.

        System.out.println((int)(Math.random()*44));


        // 포문 안에 선언한 nomu를 sout 값이 수식을 두 번 받는다 생각함.
        //

        for (int i =0; i<5000; i++){
            int nomu = (int)(Math.random()*45);
            if (44==nomu){
                System.out.println("응 45까지 나와"+nomu );
                System.out.println(nomu);

            }
        }
    }
}

