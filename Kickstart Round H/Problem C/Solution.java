import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Solution {

    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final Map<String,String> pattern_map =  Map.of("01","2","12","3","23","4","34","5","45","6","56","7","67","8","78","9","89","0","90","1");

    private static int solve() {
        final int N =  _in.nextInt(); 
        _in.nextLine();
        final String S = _in.next();

        StringBuilder str = new StringBuilder(S);

        for(int i=0;i<S.length();i++){
        }
        // int result = 0;
        // for (int i = 0; i < S.length(); i++) {
        //     result += getSmallestChange(F, S.charAt(i));

        // }

        for (Entry<String, String> entry : pattern_map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        }
        return 0;
    }

    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println("Case #" + i + ": " + solve());
        }
    }
}