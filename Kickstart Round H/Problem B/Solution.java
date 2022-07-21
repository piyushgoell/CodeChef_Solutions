/*
    Problem : Painter
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "(" + key + "," + value + ")";
    }

}

public class Solution {

    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static Set<Pair<Character, Character>> set = new HashSet<>(Arrays.asList(
        new Pair<>('O', 'R'),
            new Pair<>('O', 'Y'),
            new Pair<>('P', 'R'),
            new Pair<>('P', 'B'),
            new Pair<>('G', 'Y'),
            new Pair<>('G', 'B')
    ));
    private static int solve() {
        final int N = _in.nextInt();
        final String P = _in.next();
        int result = 0;
        for (char ch : new char[] { 'Y', 'B','R' }) {
            int previous = 0;
            for (int i = 0; i < N; i++) {
                int count = 0;
                if (P.charAt(i) == ch || P.charAt(i) == 'A' || set.contains(new Pair<>(P.charAt(i),ch))) {
                    count = 1;
                }
                if (previous != count) {
                    result += previous;
                    previous = count;
                }
            }
            result += previous;
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