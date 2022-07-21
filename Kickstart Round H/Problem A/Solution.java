/*
   Problem : Transform the string
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    private static int solve() {
        final String S = _in.next();
        final String F = _in.next();
        int result = 0;
        for (Character sch : S.toCharArray()){
            int val1 = sch - 'a';
            int K = 26;
            for(Character fch : F.toCharArray()){
                int val2 = fch -'a';
                K = Math.min(K,Math.min((val2 - val1 + 26) % 26 , (val1 - val2 + 26) % 26));
            }
            result += K;
        }
        return result;
    }

    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println("Case #" + i + ": " + solve());
        }
    }
}