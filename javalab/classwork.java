// 1. Write a Java program to read n elements into a one-
// dimensional array and find the sum, average, maximum, and
// minimum values.
package javalab;
import java.util.Scanner;

public class classwork {
    public static void main(String []args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter number of elements : ");
int n = sc.nextInt();
int[]arr= new int[n];
 int max = Integer.MIN_VALUE;
 int min=Integer.MAX_VALUE;
 int sum =0;
 
System.out.println("enter elements : ");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
max =Math.max(max,arr[i]);
min=Math.min(min,arr[i]);
sum+=arr[i];

}
System.out.println("max value is :" + max);
System.out.println("min value is :" + min);
System.out.println("average value is :" + (sum)/n);
    }
}
