import java.util.Scanner;

public class JokerAndBatman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N= sc.nextInt();
            int M=sc.nextInt();
            int L =sc.nextInt();
            int[] Colors = new int[M];
            for(int i=0;i<M;i++)
                Colors[i]=sc.nextInt();
            
            int[] Lists = new int[L];
            for(int i=0;i<N;i++)
                Lists[i] =sc.nextInt();
        }
        sc.close();
    }
}
