// Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in
// all the Strings are in lowercase). (EASY)
// Sample Input 1 : arr = { "sun"
// ,
// Sample Output 1 : arr = { "earth"
// ,
// "earth"
// ,
// "mars"
// ,
// "mars"
// ,
// "mercury
// " }
// "mercury
// "
// ,
// "sun"}

public class stingarr {
public static void merge(String [] arr,int s,int e){
      int mid = s+(e-s)/2;  
     String temp[]= new String[e-s+1 ];
      int x =0;
      int idx1=s;
      int idx2=mid+1;
      while(idx1<=mid && idx2<=e){

if(arr[idx1].compareTo(arr[idx2])<=0){
temp[x++]=arr[idx1++];
}else{
temp[x++]=arr[idx2++];
}

      }

  while (idx1<=mid ) {
    temp[x++]=arr[idx1++];
  }   
  while (idx2<=e) {
    temp[x++]=arr[idx2++];
  } 
  for(int i=0;i<temp.length;i++){
arr[s+i]=temp[i];
  }

}
public static void mergeSort(String []arr,int s,int e){

  if(s>=e){
    return;
  }
        int mid = s+(e-s)/2; 
    mergeSort(arr,s,mid);
    mergeSort(arr, mid+1, e);
    merge(arr,s,e);


}

    public static void main(String args[]){
String arr[]={"sun","earth","mars","mercury"};
mergeSort(arr,0,3);
for(String fruits : arr){
System.out.println(fruits);
}
}
    
}
