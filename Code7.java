public class Code7 {
    public static void main(String[] args) {
        String input = "aaabbcccc";
        String compressed = compress(input);
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + compressed);
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same as the current one
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Character has changed or reached the end
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1; // Reset count for the next character
            }
        }

        return compressed.toString();
    }
}