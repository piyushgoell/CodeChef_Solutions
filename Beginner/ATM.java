import java.util.Scanner;

class ATM{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double withdraw = sc.nextDouble();
        double balance = sc.nextDouble();

        if((withdraw +0.50) > balance ){
            System.out.printf("%.2f",balance);
            return;
        }
        if((withdraw % 5) != 0){
            System.out.printf("%.2f",balance);
            return;
        }
        System.out.printf("%.2f",balance-withdraw-0.50);
    }
}