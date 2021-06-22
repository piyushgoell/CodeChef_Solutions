import java.util.Scanner;

public class FindMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int found = -1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == k)
                found = 1;
        }
        System.out.println(found);
        sc.close();
    }
}
