public class Code4 {
    public static void main(String[] args) {
        String input = "banana";
        
        // Step 1: Create a boolean array for all ASCII characters (256)
        // This acts as a checklist: true = seen, false = not seen
        boolean[] seen = new boolean[256];
        
        // Step 2: Use StringBuilder to construct the result
        StringBuilder result = new StringBuilder();
        
        // Step 3: Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Step 4: If we haven't seen this character yet
            if (!seen[currentChar]) {
                result.append(currentChar); // Add it to result
                seen[currentChar] = true;    // Mark it as seen
            }
        }
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + result.toString());
    }
}