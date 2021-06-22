import java.util.Scanner;

public class RangeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r =sc.nextInt();
        if(l%2==0){
            l++;
        }
        for(int i=l;i<=r;i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
