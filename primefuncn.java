import java.util.Scanner;

public class primefuncn {
public static boolean isPrime(int n){
if (n <=1) {
    return false;
}
for (int i = 2;i<=Math.sqrt(n);i++) {
    if (n%i == 0) {
        return false;
    }
    
}


return true ;



}
public static void printinrange(int start,int end){
System.out.println("prime numbers between " + start +" and " + end);
for (int i = start;i<=end;i++) {
    if (isPrime(i)) {
        System.out.println(i + " ");
    }
   
}



}

 public static void main (String args []){
Scanner enter = new Scanner(System.in);
System.out.println("enter start :");
int n1 = enter.nextInt();
System.out.println("enter end :");
int n2 = enter.nextInt();

printinrange(n1, n2);
    }
}