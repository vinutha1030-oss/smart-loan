public class Code9 {
    public static void main(String[] args) {
        String input = "test@gmail.com";
        
        if (isValidEmail(input)) {
            System.out.println("Input: " + input);
            System.out.println("Output: valid");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Output: invalid");
        }
    }

    public static boolean isValidEmail(String email) {
        // Rule 4: No spaces
        if (email.contains(" ")) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        int dotIndex = email.lastIndexOf('.');

        // Rule 1: Exactly one '@'
        if (atIndex == -1 || atIndex != lastAtIndex) {
            return false;
        }

        // Rule 3: At least 1 char before '@'
        if (atIndex == 0) {
            return false;
        }

        // Rule 2: At least one '.'
        if (dotIndex == -1) {
            return false;
        }

        // Additional logical check: '.' must come after '@' 
        // and there must be characters between them and after the dot
        if (dotIndex < atIndex + 2 || dotIndex == email.length() - 1) {
            return false;
        }

        return true;
    }
}