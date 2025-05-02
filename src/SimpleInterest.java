import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Initials");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double si= (double) (p * r * t) /100;
        double amt=si+p;
        System.out.println("Simple Interest="+si);
        System.out.println("Amount="+amt);
    }
}
