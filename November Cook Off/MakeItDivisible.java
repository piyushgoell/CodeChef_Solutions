import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MakeItDivisible {
    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static int solve() {
        int N = _in.nextInt();
        int[] arr =  new int[N];
        int one=0,two=0,sum=0;
        for(int i=0;i<N;i++){
            arr[i] = _in.nextInt();
            sum += arr[i];
            if(arr[i]%3==1)
                one++;
            if(arr[i]%3==2)
                two++;
        }
        if(sum%3!=0)
            return -1;
        else
            return Math.abs(one-two)%3 + 2 * ((Math.abs(one-two)/3)+Math.min(one, two));
    }
    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println(solve());
        }
    }
}
