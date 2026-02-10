public class Code2 {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        
        if (isPalindrome(input)) {
            System.out.println("Input: \"" + input + "\"");
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Input: \"" + input + "\"");
            System.out.println("Output: Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Remove all whitespace and convert to lowercase
        // \\s matches any whitespace character
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        // Step 2: Use two pointers to compare characters
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        
        return true; // All characters matched
    }
}