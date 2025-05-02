import java.util.*;
public class SurfaceAreaofCubeandCuboid {
    public static void main(String[] args) {
        Result2 r2 = new Result2();
        r2.display();
        r2.cube(5);
        r2.cuboid(2,3,5);
    }
}
class SArea{
    void cube(int s){
        double sarea1=6*Math.pow(s,2);
        System.out.println("Surface area of Cube="+sarea1);
    }
    void cuboid(int l, int b, int h){
        double sarea2=2*(l*b + l*h + h*b);
        System.out.println("Surface area of Cuboid="+sarea2);
    }
}
class Result2 extends SArea{
    void display(){
        System.out.println("Surface area of Cube and Cuboid");
    }
}


