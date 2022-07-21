import java.util.Scanner;

public class WhichDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long R = sc.nextInt();
            if(R >= 2000)
                System.out.println(1);
            else if(R>=1600 && R<2000)
                System.out.println(2);
            else
                System.out.println(3);
        }
        sc.close();
    }
}
