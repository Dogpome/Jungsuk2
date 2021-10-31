package ch03;

public class ch03_반올림예제 {
    public static void main(String[] args) {
     double pi = 3.141592;
     double shortpi = Math.round(pi * 1000) / 1000.0;

        System.out.println(shortpi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000));
        System.out.println(Math.round(pi*1000)/1000);

        // int 1000 으로 나눴으면 인티저값 3이 결과값이 됨.
        // 하지만 더블값으로 나눴기 때문에 3.142가 되는 것임.
    }
}
