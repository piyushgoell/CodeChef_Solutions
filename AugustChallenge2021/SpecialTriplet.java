import java.util.Scanner;

public class SpecialTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int res = 0;
            int val = 2;
            for(int i =3;i<=n;i++){
                if(i%3 == 0)
                    val++;
                res += val;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
