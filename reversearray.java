public class reversearray {
public static void reversearray(int numb[]){
int start=0;
int last=numb.length-1;
while (start<last) {
    //swapping logic 
    int temp=numb[last];
    numb[last]=numb[start];
    numb[start]=temp;
    start++;
last--;

}


}

    public static void main(String args[]){
int numb[]={1,2,3,4,5,6,7,};
// array before reversing
System.out.println("array before reversing :");
for(int i =0;i<numb.length;i++){
    System.out.println(numb[i]);
    
    }
reversearray(numb);
// array after reversing
System.out.println("array after reversing :");
for(int i =0;i<numb.length;i++){
System.out.println(numb[i]);

}


    }
}
