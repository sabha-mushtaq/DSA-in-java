// using of break statement
import java.util.Scanner;

public class breakstatement {
    public static void main(String args[]){
Scanner enter = new Scanner(System.in);
while (true) {
    System.out.println("Enter the number :");
    int n = enter.nextInt();
    if (n == 9 ) {
        break;
    }
    System.out.println(n);
}



    }
}
