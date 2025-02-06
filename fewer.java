import java.util.Scanner;

public class fewer {
    public static void main (String args[]){
System.out.println("Enter your temperature in farenhite");
Scanner enter = new Scanner(System.in);
double n = enter.nextDouble();
if (n >100) {
    System.out.println("you have a fewer");
} else {
    System.out.println("you don't have a fewer"); 
}


    }
}
