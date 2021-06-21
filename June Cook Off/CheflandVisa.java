import java.util.Scanner;

public class CheflandVisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int count = 0;
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();
            
            if(x2>=x1)
                count++;
            if(y2>=y1)
                count++;
            if(z2 <= z1)
                count++;
            if(count ==3)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }

    }
}
