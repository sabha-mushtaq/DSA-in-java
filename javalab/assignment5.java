// Write a Java program to read n elements in a one-
// dimensional array and display the elements in reverse order
// and count the number of even and odd elements.


public class assignment5 {
    public static void reverse(int arr[]){
int countodd=0;
int counteven=0;
for(int i=arr.length-1;i>=0;i--){
    System.out.println(arr[i]);
    if(arr[i]%2==0){
        counteven++;
    }else{
        countodd++;
    }
}
System.out.println("number of odd elements is : " + countodd);
System.out.println("number of even elements is : " + counteven);
    }
    public static void main(String args[]){
int arr[]={1,2,3,4,5,6,4};
reverse(arr);
    }
}
