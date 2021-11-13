package 혼자하는자바;

public class 증감연산자 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("---------------------------");
        x++; // x값(10)에 +1해준다는 뜻
        ++x; // 먼저 +1을 해주고 x값에 더해줌   -- 위에서 x값에 +1, 아래서 +1 총 12 나옴.
        System.out.println("x=" +x);
        System.out.println("---------------------------");
        y--;
        --y; // 8이 나와야하고
        System.out.println("y=" +y);
        System.out.println("---------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("---------------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("---------------------------");
    }
}
