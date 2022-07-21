
import java.util.Scanner;

public class ProblemDifiiculty {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int map[] = new int[11];
            int unique = 0;
            for(int i=0;i<4;i++){
                int val = sc.nextInt();
                if(map[val]==0)
                    unique++;
                map[val]+=1;
            }
            if(unique == 4 || unique == 3)
                System.out.println(2);
            else if(unique == 2){
                int flag = 0;
                for(int i=0;i<11;i++){
                    if(map[i]==2)
                        flag++;
                }
                if(flag == 2)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
            else 
                System.out.println(0);
        }
        sc.close();
    }
}
