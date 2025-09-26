public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char toRemove = 'l';
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != toRemove) {
                result.append(c);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
