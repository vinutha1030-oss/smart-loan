public class Code6 {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("Input: " + input);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: None");
        }
    }

    public static char findFirstNonRepeating(String str) {
        // Step 1: Create a frequency array for ASCII characters (256)
        int[] counts = new int[256];

        // Step 2: First pass - Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i)]++;
        }

        // Step 3: Second pass - Iterate through the string in original order
        // and check the frequency array for the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (counts[current] == 1) {
                return current; // Found the first non-repeater
            }
        }

        return '\0'; // Return null char if no non-repeating char exists
    }
}