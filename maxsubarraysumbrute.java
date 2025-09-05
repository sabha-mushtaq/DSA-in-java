public class maxsubarraysumbrute {
    public static void findmaxsum(int[] arr){
    int maxsum=Integer.MIN_VALUE ;
for(int i=0;i<arr.length;i++){

for(int j=i;j<arr.length;j++){
        int currsum=0;
for(int k=i;k<=j;k++){

    currsum+=arr[k];
}
System.out.println(" sum of subarrays equal to :"+ currsum);
if (currsum>maxsum) {
  maxsum=currsum;
    
}
}


}

System.out.println("max sum is equal to :"+ maxsum);
    }
    public static void main(String args[]){
int [] numb ={1,2,3,4,5,5};
findmaxsum(numb);
    }
}
