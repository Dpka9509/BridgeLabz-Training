import java.util.Scanner;

public class A3level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================================
        // 1. Check if a number is divisible by 5
        /*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Is the number " + num + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + num + " divisible by 5? No");
        }
        */

        // ============================================================
        // 2. Check if the first is the smallest of 3 numbers
        /*
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
        */

        // ============================================================
        // 3. Check which number is the largest of 3
        /*
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2));
        */

        // ============================================================
        // 4. Check for natural number and sum of n natural numbers
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        */

        // ============================================================
        // 5. Check voting eligibility
        /*
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        */

        // ============================================================
        // 6. Check whether number is positive, negative, or zero
        /*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
        */

        // ============================================================
        // 7. SpringSeason check
        /*
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        */

        // ============================================================
        // 8. Countdown using while loop
        /*
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blastoff!");
        */

        // ============================================================
        // 9. Countdown using for loop
        /*
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Blastoff!");
        */

        // ============================================================
        // 10. Sum of numbers until user enters 0
        /*
        double total = 0.0;
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            double val = sc.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println("Total sum = " + total);
        */

        // ============================================================
        // 11. Sum until user enters 0 or negative number
        /*
        double total = 0.0;
        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double val = sc.nextDouble();
            if (val <= 0) break;
            total += val;
        }
        System.out.println("Total sum = " + total);
        */

        // ============================================================
        // 12. Sum of n natural numbers using while loop and formula
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0, i = 1;
            while (i <= n) {
                sum2 += i;
                i++;
            }
            System.out.println("Formula sum = " + sum1 + ", While loop sum = " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
        */

        // ============================================================
        // 13. Sum of n natural numbers using for loop
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0;
            for (int i = 1; i <= n; i++) {
                sum2 += i;
            }
            System.out.println("Formula sum = " + sum1 + ", For loop sum = " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
        */

        // ============================================================
        // 14. Factorial using while loop
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
        */

        // ============================================================
        // 15. Factorial using for loop
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
        */

        // ============================================================
        // 16. Print odd and even numbers up to n
        /*
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) System.out.println(i + " is Even");
                else System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Not a natural number");
        }
        */

        // ============================================================
        // 17. Bonus of employees based on years of service
        /*
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yrs = sc.nextInt();
        if (yrs > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus");
        }
        */

        // ============================================================
        // 18. Multiplication table of a number from 6 to 9
        /*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        */
    }
}
