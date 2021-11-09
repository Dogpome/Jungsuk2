package ch07객체지향2;

class ch07_11조상의생성자 {
    // 조상의 생성자를 호출할 때 사용
    // 조상의 멤버는 조상의 생성자를 호출해서 초기화

    class Point4 {
        int x, y;


        Point4(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    class nomukun extends Point4 {


        nomukun(int x, int y) {
            super(x, y);
        }
    }
}
