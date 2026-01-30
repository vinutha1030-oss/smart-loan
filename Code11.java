import java.util.Scanner;
class Code11{
    public static void main(String[]args){
        

        Scanner sc = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Calculate the sum of first N natural numbers
        int sum = N * (N + 1) / 2;

        // Display the result
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);

        sc.close();
    }
}

    
