import java.util.Scanner;

public class sign {
    public static void main(String args[]){
Scanner enter = new Scanner(System.in);
System.out.println("Enter the number :");
int n = enter.nextInt();

if (n <0) {
   System.out.println(n + " is a negative number"); 
} else {
    System.out.println(n + " is a positive number"); 
}


    }
}
