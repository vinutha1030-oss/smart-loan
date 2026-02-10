public class Code3 {
    public static void main(String[] args) {
        String input = "programming";
        
        // Step 1: Remove spaces as per description
        String cleanStr = input.replace(" ", "");
        
        // Step 2: Create an array to store counts (ASCII size is 256)
        int[] freq = new int[256];
        
        // Step 3: Iterate through the string and increment the index 
        // corresponding to the character's ASCII value
        for (int i = 0; i < cleanStr.length(); i++) {
            char c = cleanStr.charAt(i);
            freq[c]++;
        }
        
        // Step 4: Print the results
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " _>" + freq[i]);
            }
        }
    }
}