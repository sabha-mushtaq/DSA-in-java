import java.util.Scanner;

public class PrimeInRang {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers <=1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        return true; // Prime number
    }

    // Method to print prime numbers in a given range
    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing primes
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        
        printPrimesInRange(start, end);
        
        scanner.close();
    }
}
