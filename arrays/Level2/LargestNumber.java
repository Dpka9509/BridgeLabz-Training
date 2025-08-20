import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("First number is the largest.");
        else if (b >= a && b >= c)
            System.out.println("Second number is the largest.");
        else
            System.out.println("Third number is the largest.");

    }
}
