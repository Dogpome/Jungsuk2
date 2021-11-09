package ch07객체지향2;

 class Point3 {
     int x;
     int y;

     String getLocation() {
         return "x" + x + ", y:" + y;
     }
 }
 class MyPoint3D extends Point3 {
     int z;

     // Point3 getLocation을 오버라이드할거임
     String getLocation() {
         return "x:" +x+", y:"+y+", z:"+z;
     }
 }

 public class ch07_overridetest {
     public static void main(String[] args) {
         MyPoint3D p = new MyPoint3D();
         //
         p.x = 3;
         p.y = 4;
         p.z = 5;
     }
}
