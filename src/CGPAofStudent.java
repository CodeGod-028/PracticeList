import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class CGPAofStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //HashMap to Store Subjects and Marks
        HashMap<String, Float> map = new HashMap<>();

        //No. Of Subjects
        System.out.println("Enter the Number of Subjects");
        int n = sc.nextInt();
        sc.nextLine(); //Consume New Line

        //Loop to take n Entries
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Key(Subjects):");
            String subject = sc.nextLine();

            System.out.println("Enter Value(Number):");
            float marks = sc.nextFloat();
            sc.nextLine(); //Consume New Line

            map.put(subject,marks); // Add key Value pair into the Map
        }

        // Print the HashMap //Consume New Line
        double totalgrade=0.0;
        for (Map.Entry<String, Float> e : map.entrySet()) {
            System.out.println("Key:" + e.getKey()+" " + "Value:" + e.getValue());
            totalgrade += e.getValue();
        }

        //Calculate Cgpa
        double cgpa=totalgrade/n;
        double cgpapercentage= cgpa*9.5;
        System.out.printf("CGPA= %.2f\n",cgpa);
        System.out.printf("Total Grade= %.2f\n",totalgrade);
        System.out.printf("CGPA Percentage= %.2f%%\n",cgpapercentage);
        sc.close();
    }
}
