// Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class avgfunc {
public static int findavg(int n1, int n2,int n3){

int n4 = (int)(n1+n2+n3)/3;

System.out.println("avg of " + " "+ n1  +", "+ n2 +" ,"+ n3 +" is " + n4);



return n4;

}

    public static void main (String args[]){

Scanner enter = new Scanner(System.in);
System.out.println("enter n1,n2,n3 respectively :");
int n1 = enter.nextInt();
int n2 = enter.nextInt();
int n3 = enter.nextInt();
findavg(n1, n2, n3);



    }
}
