import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int key = sc.nextInt();
                map.put(key,map.getOrDefault(key, 0)+1);
            }
        }
    }
}
