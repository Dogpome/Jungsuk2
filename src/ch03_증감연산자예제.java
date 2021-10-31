public class ch03_증감연산자예제 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i; // 후위형 // j=i++; 를 좌측처름 나눠 표현
        i++;

        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
        /// 앞에 "" 안에는 문자열 표기일 뿐이니 무시, 연산은 i부터 시작
        /// 후위형은 대입을 먼저하고 증가 시키고, 전위형은 증가를 1 시키고 대입함.
        j=5;
        j=0;

        j = i;
        ++i; // 전위형;
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}
