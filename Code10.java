public class Code10 {
    public static void main(String[] args) {

        int n = 50000;

        // -------- Program 1: Using String --------
        long startTime1 = System.currentTimeMillis();

        String str = "";
        for (int i = 1; i <= n; i++) {
            str += i; // concatenation using String
        }

        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;

        System.out.println("Time taken using String: " + duration1 + " ms");

        // -------- Program 2: Using StringBuilder --------
        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i); // concatenation using StringBuilder
        }

        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;

        System.out.println("Time taken using StringBuilder: " + duration2 + " ms");
    }
}


        
