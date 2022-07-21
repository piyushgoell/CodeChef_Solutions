import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class DisabledKing {
    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    public static boolean isValid(int x, int y, int N) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    private static int solve() {
        int N = _in.nextInt();

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> visited = new HashMap<>();
        String src = "0,0";
        queue.add(src);
        visited.put(src, 0);
        int row[] = new int[] { 1,-1,-1,1 };
        int col[] = new int[] { 0, 1,0, 1};

        while (!queue.isEmpty()) {
            String loc = queue.remove();
            int x = Integer.parseInt(loc.split(",")[0]);
            int y = Integer.parseInt(loc.split(",")[1]);
            if (x == 0 && y == (N-1)) {
                return visited.get(loc);
            }

            for (int i = 0; i < 4; i++) {
                int newX = x + row[i];
                int newY = y + col[i];
                String nextLoc = newX + "," + newY;
                if (isValid(newX, newY, N) && !visited.containsKey(nextLoc)) {
                    queue.add(nextLoc);
                    visited.put(nextLoc, visited.get(loc) + 1);
                }
                

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println(solve());
        }
    }

}
