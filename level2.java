import java.util.*;

public class level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Question 2
        double base_cm = sc.nextDouble();
        double height_cm = sc.nextDouble();
        double area_cm2 = 0.5 * base_cm * height_cm;
        double area_in2 = area_cm2 / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + area_in2 + " and sq cm is " + area_cm2);

        // Question 3
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Question 4
        double distance_ft = sc.nextDouble();
        double yards = distance_ft / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        // Question 5
        double unit_price = sc.nextDouble();
        int quantity = sc.nextInt();
        double total_price = unit_price * quantity;
        System.out.println("The total purchase price is INR " + total_price + " if the quantity " + quantity + " and unit price is INR " + unit_price);

        // Question 6
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2);
        } else {
            System.out.println("Division by zero is not possible.");
        }

        // Question 7
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        // Question 8
        double da = sc.nextDouble();
        double db = sc.nextDouble();
        double dc = sc.nextDouble();
        double dresult1 = da + db * dc;
        double dresult2 = da * db + dc;
        double dresult3 = dc + da / db;
        double dresult4 = da % db + dc;
        System.out.println("The results of Double Operations are " + dresult1 + ", " + dresult2 + ", " + dresult3 + ", " + dresult4);

        sc.close();
    }
}
