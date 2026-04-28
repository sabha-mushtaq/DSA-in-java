// Assignment 2: Write a Java program that classifies a number as:
//  Positive / Negative / Zero
//  Even / Odd
//  Multiple of 5 or not
//  Three-digit or not
// Display all classifications.
package javalab;

public class Assignment2 {
    public static void classification(int numb){
        int count =0;
        System.out.println("number has following properties:");
        if (numb<0) {
            System.out.println(numb + "is negative");
        }else{
           System.out.println(numb + "is positive"); 
        }
        if(numb%2==0){
   System.out.println(numb + " is even");
        }else{
         System.out.println(numb + " is odd");    
        }
        if(numb%5==0){
System.out.println(numb + " is multiple of 5");
        }else{
System.out.println(numb  + " is not  multiple of 5");
        }
while(numb>0){
int r =numb%10;
numb=numb/10;
count++;
}
if(count==3){
System.out.println("number contains three digits");
}
    }
    public static void main(String args[]){
classification(333);
    }
}
