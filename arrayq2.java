// Question 2 : Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
// Print out the sum of the numbers in the second row of the
// “
// nums” array.

public class arrayq2 {

 public static int sum(int matrix[][]) {
int m=matrix[0].length;
int sum=0;
for(int i=0;i<m;i++){
sum+=matrix[1][i];

}
return sum;
 }  

    public static void main(String args[]){
int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
System.out.println(sum(nums));
    }
}
