public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "abababab";
        String sub = "ab";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences of \"" + sub + "\": " + count);
    }
}
