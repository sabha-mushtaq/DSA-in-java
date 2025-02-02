import java.util.Scanner;

public class continuestatement {
    public static void main(String args[]){
        Scanner enter = new Scanner(System.in);
do {
    System.out.println("enter the number :");
int n = enter.nextInt();
if (n == 9) {
    continue;
}
System.out.println(n);
} while (true);



    }
}
