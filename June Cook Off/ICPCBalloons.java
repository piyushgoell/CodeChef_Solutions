import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0, res = 0;
            boolean flag = true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i] <= 7)
                    count++;
                if(flag && count == 7){
                    res = (i+1);
                    flag = false;
                }
            }
            System.out.println(res); 
               
            t--;
        }
    }
}
