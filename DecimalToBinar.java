import java.util.Scanner;

public class DecimalToBinar {
    public static int convertDecimalToBinary(int n) {
        int binary = 0; // Store the binary number
        int place = 1;  // Track place value (1, 10, 100...)

        while (n > 0) {
            int rem = n % 2;   // Get remainder when divided by 2
            binary = binary + (rem * place);  // Append remainder
            place *= 10;   // Move to the next binary place value
            n = n / 2;   // Reduce n by dividing by 2
        }

        return binary; 
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n1 = scanner.nextInt();

        int binaryResult = convertDecimalToBinary(n1);  // Call function
        System.out.println("Binary conversion of " + n1 + " is: " + binaryResult);

        scanner.close();
    }
}
