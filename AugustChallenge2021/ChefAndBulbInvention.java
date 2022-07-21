import java.util.Scanner;

public class ChefAndBulbInvention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long N = sc.nextInt()-1;
            long P = sc.nextInt();
            long K = sc.nextInt();
            //long daysinOneIteration = (N+1)/K;
            long daysincycle = (N/K);
            long remaningdays = N%K + 1;
            long noOfCycles = P%K;
            //System.out.print(daysincycle+ " "+remaningdays+" : "+noOfCycles+" :  ");
            long additionalDays = Math.min(remaningdays,noOfCycles);
            
            long res = (noOfCycles*daysincycle)+additionalDays + ((P/K)+1);
            //System.out.println((noOfCycles*daysincycle) + " " + noOfCycles + " " +((P/K) + 1));
            //System.out.println(remaningdays>=noOfCycles? P/K : 0);
            System.out.println(res);
        }
        sc.close();
    }
}
