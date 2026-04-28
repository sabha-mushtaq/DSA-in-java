// Assignment 3:Write a Java program to compute salary using:
//  Basic salary input
//  HRA = 20% of basic if basic ≤ 20000 otherwise 30%
//  DA = 80% of basic
//  Tax = 10% if gross salary > 50000
// Display gross and net salary.
import java.util.*;


public class Assignment3 {
      public static void compute(){ 
        Scanner salary = new Scanner(System.in);
       System.out.println("Enter your salary :");
          int a = salary.nextInt();
           double hra;
           double DA;
             double tax;
          if(a<=20000){
           hra = (double)(0.2)*a;
                 System.out.println("HRA IS : " + hra);
          }else{
            hra = (double)(0.3)*a;
                   System.out.println("HRA IS : " + hra);
          }
        
 DA = (double)(0.8)*a;
System.out.println("DA IS : " + DA );
if (a>50000) {
   tax = (double)(0.1)*a;
    System.out.println("tax is : " + tax );
}

        }

        public static void main(String[] args) {
            compute();
        }

}
