import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        int fact= 1;
System.out.println("enter the number :");
Scanner enter = new Scanner(System.in);
int n = enter.nextInt();
for (int index = n; index > 0; index--) {
    fact*=index;
}

System.out.println("factorial of n is " +fact);

    }
}
