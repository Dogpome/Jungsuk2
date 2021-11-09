package ch07객체지향2;

// 오버라이딩 상속받은 조상의 메서드를 자신에맞게 변경하는 것.
    class Point {
        int x;
        int y;

        String getLocation() {
            return "X :" + x+ ", y:"+ y;
        }
    }


class Point3D extends Point {
    int z;

    @Override
    String getLocation() {
        return "x :" + x + ", y :" + ", z :" +z;
    }
    // 위에 상속부분인 선언부분은 못바꾸고
    // 구현부만 변경됨 이 정정 작업을 오버라이딩이라 부름.
}
