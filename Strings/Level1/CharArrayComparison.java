import java.util.Scanner;

public class CharArrayComparison {
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(customArray, builtInArray);

        System.out.print("Custom Char Array: ");
        for (char c : customArray) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in Char Array: ");
        for (char c : builtInArray) System.out.print(c + " ");
        System.out.println();

        System.out.println("Comparison Result: " + result);
    }
}
