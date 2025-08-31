public class maxvaluearray {
public static int maxnumber(int arr[]){
    int a = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
if (arr[i]> a) {
    a=arr[i];
}

    }
return a;
}
public static int minnumber(int arr[]){
    int a = Integer.MAX_VALUE;
    for(int i =0;i<arr.length;i++){
if (arr[i]< a) {
    a=arr[i];
}

    }
return a;
}
    public static void main(String args[]){
int arr[]={0,3,4,6,7,8,10};
System.out.println(maxnumber(arr));
System.out.println(minnumber(arr));


    }
}
