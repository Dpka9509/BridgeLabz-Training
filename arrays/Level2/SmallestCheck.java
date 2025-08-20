import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a < b && a < c)
            System.out.println("Yes, the first number is the smallest.");
        else
            System.out.println("No, the first number is not the smallest.");
    }
}
