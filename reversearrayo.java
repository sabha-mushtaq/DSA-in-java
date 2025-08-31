public class reversearrayo {
public static void reversearray(int arr[]){

int start =0;
int last = arr.length-1;
while (start<last ) {
    int temp = arr[start];
    arr[start]=arr[last];
    arr[last]=temp;
    start++;
    last--;
    
}
for (int index = 0; index < arr.length; index++) {
    System.out.print(arr[index] + " ");
}
System.out.println();
}

    public static void main (String args []){
int arr[]={1,8,5,3,6};
System.out.println("array before reversal");
for (int index = 0; index < arr.length; index++) {
     System.out.print(arr[index]+ " ");
}
System.out.println();
System.out.println("array after reversal");

reversearray(arr);



    }
}
