public class Code8 {
    public static void main(String[] args) {
        String input = "java is extremely powerful";
        String longest = findLongestWord(input);
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + longest);
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        // Step 1: Split the sentence into words
        // \\s+ handles multiple spaces between words
        String[] words = sentence.trim().split("\\s+");
        
        // Step 2: Initialize the longest word as the first word
        String longestWord = "";

        // Step 3: Iterate through the array
        for (String word : words) {
            // Step 4: Update longestWord only if current word is strictly longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}