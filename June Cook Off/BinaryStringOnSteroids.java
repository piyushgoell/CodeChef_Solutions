import java.util.Scanner;

public class BinaryStringOnSteroids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            for(int i=0;i<n;i++)
                sum+=s.charAt(i)-'0';
            int ans = n;
            
            for(int i = 1;i<=n;i++){
                if(n%i != 0) // factors of n [ 6 = 1,2,3,6 ]
                    continue;
                for(int j=0;j<i;j++){ //[ checking for all possible arrangement for a factor]
                    int temp = 0;
                    for(int k=j;k<n;k+=i){
                        if(s.charAt(k) == '1')
                            temp -= 1;
                        else
                            temp += 1;
                    }
                ans = Math.min(ans, sum+temp);
                    
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
