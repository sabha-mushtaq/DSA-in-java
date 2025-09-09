// trapped rain water problem very important 
public class trainwatert {
    public static int calwater(int height[]){
//calculate left max
int n = height.length;
int []leftmax = new int[n];
leftmax[0]=height[0];
for (int i = 1; i< height.length; i++) {
    leftmax[i]=Math.max(height[i],leftmax[i-1]);
}
// calculate right max 
int[] rightmax = new int[n];
rightmax[n-1]=height[n-1];
for (int i = n-2 ; i >=0; i--) {
    rightmax[i]=Math.max(rightmax[i+1], height[i]);
}
// calculate trapped water
int trappedwater=0;
for (int i = 0; i < height.length; i++) {
   int  waterlevel =Math.min(leftmax[i], rightmax[i]);
    
  trappedwater+= (waterlevel-height[i]);
   
}
return trappedwater;
    }
    public static void main(String Args[]){
int height[] = {4,2,0,6,3,2,5};
System.out.println(calwater(height));


    }
}
