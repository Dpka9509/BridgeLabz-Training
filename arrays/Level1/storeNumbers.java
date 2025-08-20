import java.util.Scanner;

public class storeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (index < arr.length) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal = " + total);
    }
}
