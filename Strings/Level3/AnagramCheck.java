import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String str2 = sc.nextLine().toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("The words are Anagrams");
        } else {
            System.out.println("The words are NOT Anagrams");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
