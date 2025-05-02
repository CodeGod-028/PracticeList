import java.util.*;
public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimensions of Cylinder");
        int r=sc.nextInt();
        int h=sc.nextInt();
        PieFunction pi=new PieFunction();
        double vol=2*pi.pie()*(r+h);
        System.out.println("Volume of Cylinder="+vol);
    }
}
