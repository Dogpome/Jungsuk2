package Ch0412;

public class G구구단Kr {
    private void printMultiplicationTable(int dan){
        System.out.printf("-----%s------%n", dan);
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
        }
    }
    public static void main(String[] args) {
        G구구단Kr g구구단Kr = new G구구단Kr();

        for(int i = 2; i <= 9; i++) {
            g구구단Kr.printMultiplicationTable(i);
        }

    }
}
