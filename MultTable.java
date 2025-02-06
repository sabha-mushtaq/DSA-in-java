import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        // Printing multiplication table
        System.out.println("\nMultiplication Table of " + n + ":");
        for (int index = 1; index <= 10; index++) {
            System.out.println(n + " × " + index + " = " + (n * index));
        }

        // Closing the scanner
        scanner.close();
    }
}
