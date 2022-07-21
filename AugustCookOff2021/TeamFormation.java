import java.util.Scanner;

public class TeamFormation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String t = sc.nextLine();
            int programmingCount = 0, englishCount = 0, flag = 0, bothCount = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    programmingCount++;
                    flag++;
                }
                if (t.charAt(i) == '1') {
                    englishCount++;
                    flag++;
                }
                if (flag == 2) {
                    bothCount++;
                    programmingCount--;
                    englishCount--;
                }
                flag = 0;

            }
            int result = 0;

            if (n > (2 * bothCount)) {
                result = bothCount;
                int x = (n - (2 * bothCount));
                if (x >= 2) {
                    result += Math.min((x / 2), Math.min(programmingCount, englishCount));
                }
            } else {
                result = n - bothCount;
            }
            System.out.println(result);
        }

        sc.close();
    }
}
