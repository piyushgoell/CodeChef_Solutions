import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum = sc.nextInt() + sc.nextInt();
            if(sum >= 6)
                System.out.println(0);
            else{
                System.out.printf("%.6f\n",(6.0-sum)/6);
            }
        }
        sc.close();
    }
}
