import java.util.Scanner;

public class BuyPlease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long ans = (a*x) + (b*y);
        System.out.println(ans);
    }
}
