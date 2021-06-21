import java.util.Scanner;

public class XORFolding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n =sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i=0;i<n;i++){
                arr[i] = convertToInt(sc.next());
            }
            for(int i=1;i<n;i++){
                for(int j =0;j<m;j++){
                    arr[i][j] = (arr[i][j] ^ arr[i-1][j]);
                }
            }

            for(int j = 1;j<m;j++){
                    arr[n-1][j] ^= arr[n-1][j-1];
            }
            
            if(arr[n-1][m-1] == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            
            t--;
        }
    }
    public static int[] convertToInt(String str){
        int arr[] = new int[str.length()];
        int i=0;
        for(char ch : str.toCharArray()){
            arr[i] = ch-'0';
            i++;
        }
        return arr;
    }
    
}
