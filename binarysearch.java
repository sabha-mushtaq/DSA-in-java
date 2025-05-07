public class binarysearch {
public static int binarysearch(int numb[],int key){
int start=0;
int end=numb.length-1;

while (start<=end) {
    int mid=(start+end)/2;
    if (numb[mid]==key) {
      return mid;  
    }
    if (numb[mid]<key) {
        start=mid+1;
    }
    if (numb[mid]>key) {
        end =mid-1;
    }
    
}
return -1;
}

    public static void main(String args[]){
    int numb[]={1,2,3,4,5,6,7,8}  ;  
int result=binarysearch(numb, 7);
if (result == -1) {
    System.out.println("NOT FOUND");
}else{
    System.out.println("element found at index "+ result);
}

    }
}
