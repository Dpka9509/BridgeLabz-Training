import java.util.Scanner;
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Position " + i + " = FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Position " + i + " = Fizz");
            else if (i % 5 == 0)
                System.out.println("Position " + i + " = Buzz");
            else
                System.out.println("Position " + i + " = " + i);
        }
    } 
}
