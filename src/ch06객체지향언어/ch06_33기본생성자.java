package ch06객체지향언어;

    class Data_1 {
        int value;
        Data_1() {} // 기본생성자를 추가

        // 생성자 만들 때, 기본 생성자를 꼭 넣어줘야해 그게 핵심임.
    }

    class Data_2 {
        int value;
        Data_2() {} // <- 기본생성자임
        Data_2(int x) { // 매개변수가 있는 생성자.
            value = x;
             }
    }


class Ex6_11 {
    public static void main(String[] args) {
       Data_1 d1 = new Data_1();
       Data_2 d2 = new Data_2(); // 데이터2 생성자 없으면 에러남
        //


    }
}