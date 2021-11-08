package CODEUP;

public class CODEUP_1 {


        // 1번 문제
        //    C/C++언어에서 가장 기본적인 명령이 출력문이다.
        //   printf()를 이용해 다음 단어를 출력하시오.
        // Hello
        // 2번 문제
        //다음 문장을 출력해보자.
        // Hello World
        // 3번 문제
        // 이번에는 줄을 바꿔 출력하는 출력문을 연습해보자.
        //다음과 같이 줄을 바꿔 출력해야 한다.
       //Hello
       //World
        //(두 줄에 걸쳐 줄을 바꿔 출력)
        // 4번 문제
        // 다음 문장을 출력하시오.
        //'Hello'
        // 다음 문장을 출력하시오.
        // 5번 문제
         //"Hello World"
          //(단, 큰따옴표도 함께 출력한다.)
        // printf( ) 함수로 큰 따옴표 문자 " 를 출력하기 위해서는 \" 로 출력해야 한다.
        // 6번 문제
        //다음 문장을 출력하시오.
        // "!@#$%^&*()"
        // (단, 큰따옴표도 함께 출력한다.)
        // 7번 문제
        // 다음 경로를 출력하시오.
         //"C:\Download\hello.cpp"
          //(단, 큰따옴표도 함께 출력한다.)


    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello World");
        System.out.println("Hello\n World");// <- 백슬래쉬 사용이 핵심 \n
                                    //줄 바꿈 하고자 하는 문장에 \n
     //  System.out.println("Hello\t World");// <-- \t  사용시 간격이 늘어남
        System.out.println("'Hello'");
        System.out.println("\"Hello World\""); //<- 큰따옴표를 중복 사용되지 않아.
        //                              ㄴ 백슬래쉬(\)를 넣어주고 큰따옴표를 넣으니된다.
        //           ㄴ 어째서 큰따옴표가 두번 연속 안들어가는지는 알지못한다. 참조대로했다.
        System.out.println("\"!@#$%^&*()\""); // <- 5번문제와 같은 방식
        System.out.println("\"C:\\Download\\hello.cpp\""); // <- 7번과 동일하게 풂.




    }


}
