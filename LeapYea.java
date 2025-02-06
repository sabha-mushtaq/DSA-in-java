import java.util.Scanner;

public class LeapYea {
    public static void main(String args[]){
        System.out.println("enter a year :");
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        if (n%4 == 0 ||( n % 100 != 0 && n %400 ==0)) {
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }
    }
}

