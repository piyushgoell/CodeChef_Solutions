import java.util.Arrays;
import java.util.Scanner;

public class ReverseMe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        // For Using comparator class you have to use Object class
        // Arrays.sort(arr,(Integer a, Integer b)->b-a);
        for(int i = n-1 ;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
