import java.util.Scanner;

public class Prodfunction {
    // function for finding product
public static int multiply(int a,int b){
return a * b;


}
// function for finding factorial 
public static int factorial(int n){
int f = 1;
for(int i =1;i <=n;i++){
f = f * i;



}
return f;

}
// function to find binomial coefficient
public static int binomcoeff(int n, int r) {
    int factn = factorial(n);
    int factr = factorial(r);
    int c = factn/(factr*factorial(n-r));
    return c;
}
    public static void main(String args[]){
        Scanner numb = new Scanner(System.in);
        // System.out.println("enter a :");
        // int a = numb.nextInt();
        // System.out.println("enter b :");
        // int b = numb.nextInt();

// int c = multiply(a, b);
// System.out.println("product of " + a + " and "+ b + " is " + c );
System.out.println("enter n :");
int n = numb.nextInt();
// System.out.println("factorial of " + n + " is "+ factorial(n));
System.out.println("enter r : ");
int r =numb.nextInt();
System.out.println("binomial coefficient of " + n + " and " + r + " is " + binomcoeff(n, r));
numb.close();
    }
}