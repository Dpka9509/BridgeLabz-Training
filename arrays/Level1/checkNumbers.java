import java.util.Scanner;
public class checkNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive Even");
                else
                    System.out.println(num + " is Positive Odd");
            } else if (num < 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Negative Even");
                else
                    System.out.println(num + " is Negative Odd");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal.");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last element.");
        else
            System.out.println("First element is less than last element.");
    }
}
