import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FactorsFinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> factors = new TreeSet<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                factors.add(i);
                factors.add(n/i);
            }
        }
        System.out.println(factors.size());
        for (Integer i : factors) {
            System.out.print(i +" ");
        }
    }
}
