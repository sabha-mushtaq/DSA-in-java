import java.util.Scanner;

public class EvenOddSu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for total numbers
        System.out.print("Enter the total number of integers in the set: ");
        int n = scanner.nextInt();

        int evenSum = 0, oddSum = 0;

        System.out.println("Enter " + n + " integers:");
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                evenSum += a; // Adding even numbers
            } else {
                oddSum += a;  // Adding odd numbers
            }
        }

        // Printing results separately
        System.out.println("\nResults:");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        // Closing the scanner
        scanner.close();
    }
}
