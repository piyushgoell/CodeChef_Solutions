import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OddAndEvens {
    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static String solve() {
        int a = _in.nextInt();
        int b =  _in.nextInt();
        int sum = a+b;
        return (sum%2==0)? "Bob" : "Alice";
    }
    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println(solve());
        }
    }
}
