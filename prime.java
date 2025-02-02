// checking whether a number is prime or not using optimized approach
import java.util.Scanner;

public class prime {
   public static void main(String args[]) {
    Scanner enter = new Scanner(System.in);
    System.out.println("enter the number :");
    int n = enter.nextInt();
    boolean isprime = true;
    if (n <=1 ) {
        System.out.println("number is not prime");
    }
    else{
for (int index = 2; index <= Math.sqrt(n); index++) {
    if (n % index == 0) {
       isprime = false;
       break;
    }
}
if (isprime) {
    System.out.println("number is prime");
} else {
    System.out.println("number is not prime");
}
    }

   }
}
