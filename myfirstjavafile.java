// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class myfirstjavafile{

public static void main (String args[]){
System.out.print("Enter the numbers a ,b and c \n");
Scanner numb = new Scanner(System.in);

int a = numb.nextInt();
int b = numb.nextInt();
int c = numb.nextInt();
int avg = (a+b+c)/3;
System.out.print(avg);
}



}