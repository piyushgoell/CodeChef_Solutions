import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissingSums {
    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static int[] solve() {
        int N = _in.nextInt();
        int arr[] =new int[N];
        arr[0]=1;
        for(int i=1;i<N;i++){
            
        }

        return arr;
    }
    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println(solve());
        }
    }
}
