package ch05;

public class ch05_의사코드최대값 {
    public static void main(String[] args) {
        // 최대값, 최소값 을 구해야함
        int[] maxmin2 = {13, 88, 99 , 1100, 200, 300};
        int max = maxmin2[0];

        for (int i = 1; i <maxmin2.length; i++) {
            if (maxmin2[i] > max){
                max = maxmin2[i];

            }
        }
        System.out.println("최대값" + max);


    }
}
