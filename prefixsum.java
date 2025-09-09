// prefix sum maxarray method
public class prefixsum{
    public static void findmaxarray(int[] arr){
int [] prefixarr =new int[arr.length];
prefixarr[0]=arr[0];
for (int i = 1; i< arr.length; i++) {
    prefixarr[i]=prefixarr[i-1]+arr[i];
};
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
int currsum=(i==0)?prefixarr[j]:prefixarr[j]-prefixarr[i-1];
maxsum=Math.max(currsum,maxsum);

    }

}
System.out.println("maxsum array is : "+ maxsum);
    }
public static void main(String args[]){
int [] numb = {1,2,-3,4,-5,6};
findmaxarray(numb);
}

}