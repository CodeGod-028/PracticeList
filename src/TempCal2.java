import java.util.*;
public class TempCal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Value");
        double fahrenheit=sc.nextInt();
        double celsius=((fahrenheit-31)*5)/9;
        System.out.printf("Celsius =%.2f`C",celsius);
    }
}
