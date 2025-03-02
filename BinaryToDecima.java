/// convert binary to decimal 


import java.util.Scanner;

public class BinaryToDecima {

    public static int converttodecimal(int n) {
        int decnumb = 0;
        int pow = 0;
        
        while (n > 0) {
            int lastdigit = n % 10;
            decnumb += lastdigit * (int) Math.pow(2, pow);
            pow++;
            n /= 10;
        }

        return decnumb;
    }

    public static void main(String args[]) {
        Scanner numb = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n1 = numb.nextInt();
        numb.close();  // Closing Scanner to prevent resource leaks

        int decimalValue = converttodecimal(n1);
        System.out.println("Decimal conversion of " + n1 + " is: " + decimalValue);
    }
}
