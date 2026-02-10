public class Code1 {
    public static void main(String[] args) {
        String input = "java is  very   powerful";
        
        // Step 1: Split the string using a regex that matches one or more whitespaces
        // trim() removes leading and trailing spaces first
        String[] words = input.trim().split("\\s+");
        
        // Step 2: Use a StringBuilder to efficiently build the result string
        StringBuilder reversed = new StringBuilder();
        
        // Step 3: Loop through the array backwards
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            
            // Add a space between words, but not after the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        System.out.println("Input:  \"" + input + "\"");
        System.out.println("Output: \"" + reversed.toString() + "\"");
    }
}

