import java.util.Arrays;
import java.util.Scanner;

public class TheWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long A[] = new long[n];
        long Q[] = new long[q]; 
        for(int i=0;i<n;i++)
            A[i]=sc.nextLong();
        Arrays.sort(A);
        for(int i=0;i<q;i++){
            Q[i] = sc.nextLong();
            int pos = Arrays.binarySearch(A, Q[i]);
            if(pos >0 && A[pos] == Q[i])
                System.out.println("0");
            else if(pos<0 && pos%2 == 0)
                System.out.println("NEGATIVE");
            else 
            System.out.println("POSITIVE");
        }
    }
}
