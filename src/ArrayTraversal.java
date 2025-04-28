import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr={3,5,6,8,9};
//        System.out.println(Arrays.toString(arr));
//        for (int j : arr) {
//            System.out.print(j+" ");
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        int i=0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
        int i = 0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        } while (i < arr.length);

    }
}
