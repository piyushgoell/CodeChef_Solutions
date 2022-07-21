import java.util.Scanner;

public class OlympicsRanking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int team1, team2;
        while(t-->0){
            team1 = sc.nextInt() + sc.nextInt() +sc.nextInt();
            team2 = sc.nextInt() + sc.nextInt() + sc.nextInt();
            

            if(team1>team2)
                System.out.println(1);
            else
                System.out.println(2);
        }
        sc.close();
        
    }
}
