import java.util.Scanner;

public class Simple_interest {
    public static void interest(int p,int r, int t){
        int si=(p*t*r)/100;
        System.out.println("simple interest: "+si);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principal amount:");
        int principal=sc.nextInt();
        System.out.println("enter the principal rate:");
        int rate=sc.nextInt();
        System.out.println("enter the principal time:");
        int time=sc.nextInt();
        interest(principal, rate, time);

    }
}