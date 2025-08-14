import java.util.Scanner;

public class level1 {
    /
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + " is " + age);
    }

    //ques2
        public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }

//ques3
     public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    //ques4
     public static void main(String[] args) {
        double costPrice = 129, sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    //ques5
    public static void main(String[] args) {
        int totalPens = 14, students = 3;
        int perStudent = totalPens / students;
        int remaining = totalPens % students;

        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }

    //ques6
     public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
    //ques7
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.6;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }

    //ques8
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
    //ques9
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter Fee: ");
        fee = sc.nextDouble();
        System.out.print("Enter Discount Percent: ");
        discountPercent = sc.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        sc.close();

        //ques10

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm;
        System.out.print("Enter height in cm: ");
        cm = sc.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
        sc.close();
    }

    //ques11
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double num2 = sc.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        sc.close();
    }

    //ques12
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 2.54 * 2.54;

        System.out.println("Area in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
        sc.close();
    }

    //ques13
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }

    //ques14
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
        sc.close();
    }

    //ques15
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }

    //ques16
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
        sc.close();
    }

}
