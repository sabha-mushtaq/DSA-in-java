// converting decimal to binary

import java.util.Scanner;

public class decimaltobinary {
public static int condectbin(int n){
    int pow = 0;
    int binary = 0;
while (n>0) {

   int  rem = n%2;
     binary = binary +(rem * (int)Math.pow(10, pow));
     pow++;
     n = n/2;
}
return binary;

}




    public static void main (String args[]){

Scanner enter = new Scanner(System.in);
System.out.println("enter n :");
int n1 = enter.nextInt();

System.out.println(condectbin(n1));


    }
}
