// kadane's algorithm
public class kadanesalgo {
    public static void maxsumarr(int[] arr){
int currsum =0;
int maxsum =Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
    currsum = currsum + arr[i];
        
    maxsum=Math.max(maxsum, currsum);
    if (currsum<0) {
       currsum =0;
    
    };

}
System.out.println("max sum subarry is : " + maxsum);
    }
    public static void main(String args[]){
int [] numb = {-1,-2,-3,-4,-5,-6};
maxsumarr(numb);
    }
}
