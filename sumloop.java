// sum of first n natural numbers

import java.util.Scanner;

public class sumloop {
    public static void main(String args[]){
System.out.println("Enter n :");
Scanner numb = new Scanner(System.in);
int number = numb.nextInt();
int sum = 0;
int i = 0;
while (i<=number) {
    sum+=i;
    i++;
}
System.out.println(sum);

    }
}
