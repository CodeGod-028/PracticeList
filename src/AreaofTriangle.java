import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of Triangle");
        int s=sc.nextInt();
        double area= (1.73*Math.pow(s,2))/4;
        System.out.println("Area of Triangle="+area);

    }
}
