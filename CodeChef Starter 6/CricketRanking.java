import java.util.Scanner;

public class CricketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int R1 = sc.nextInt();
            int W1 = sc.nextInt();
            int C1 = sc.nextInt();
            sc.nextLine();

            int R2 = sc.nextInt();
            int W2 = sc.nextInt();
            int C2 = sc.nextInt();

            int A = 0, B =0;
            
            if(R1>R2)
                A++;
            else
                B++;
            
            if(W1>W2)
                A++;
            else
                B++;

            if(C1>C2)
                A++;
            else
                B++;
            
            if(A>B)
                System.out.println("A");
            else
                System.out.println("B");
        }
        sc.close();
    }
}
