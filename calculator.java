import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner operate = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        int a = operate.nextInt();

        System.out.println("Enter the second number: ");
        int b = operate.nextInt();

        System.out.println("Enter the operator (+, -, *, /, %): ");
        char operator = operate.next().charAt(0);

        // Switch statement to handle different operations
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, /, or %.");
                break;
        }

        // Closing the Scanner
        operate.close();
    }
}
