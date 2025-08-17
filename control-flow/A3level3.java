import java.util.Scanner;
public class A3level3 {
        // 1. Print odd and even numbers
    public static void oddEvenNumbers() {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }

    // 2. Employee bonus
    public static void employeeBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }

    // 3. Multiplication table (6 to 9)
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // 4. FizzBuzz using for loop
    public static void fizzBuzzFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    // 5. FizzBuzz using while loop
    public static void fizzBuzzWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }

    // 6. Youngest and tallest friend
    public static void friendsAgeHeight() {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int minAge = ages[0], youngest = 0;
        int maxHeight = heights[0], tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = i;
            }
        }

        System.out.println(names[youngest] + " is the youngest.");
        System.out.println(names[tallest] + " is the tallest.");
    }

    // 7. Factors using for loop
    public static void factorsFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }

    // 8. Factors using while loop
    public static void factorsWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        int i = 1;
        while (i < number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }

    // 9. Greatest factor using for loop
    public static void greatestFactorFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (beside itself): " + greatestFactor);
    }

    // 10. Greatest factor using while loop
    public static void greatestFactorWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor (beside itself): " + greatestFactor);
    }

    // 11. Multiples of number below 100 using for loop
    public static void multiplesFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (<100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // employeeBonus();
        // multiplicationTable();
        // fizzBuzzFor();
        // fizzBuzzWhile();
        // friendsAgeHeight();
        // factorsFor();
        // factorsWhile();
        // greatestFactorFor();
        // greatestFactorWhile();
        // multiplesFor();
    }
}
