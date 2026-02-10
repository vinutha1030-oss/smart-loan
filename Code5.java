public class Code5 {
    public static void main(String[] args) {
        String s1 = "dormitory";
        String s2 = "dirty room";

        if (isAnagram(s1, s2)) {
            System.out.println("Output: Anagram");
        } else {
            System.out.println("Output: Not an Anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // Step 1: Normalize - remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Step 2: If lengths differ after removing spaces, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 3: Create a frequency array for ASCII characters
        int[] charCounts = new int[256];

        // Step 4: Single loop to update counts
        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++; // Increment for string 1
            charCounts[str2.charAt(i)]--; // Decrement for string 2
        }

        // Step 5: Check if all counts returned to zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}