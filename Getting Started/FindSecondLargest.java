import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(sort(a,b,c));

    }
    public static long sort(long ... args){
        Arrays.sort(args);
        return args[1];
    }
}
