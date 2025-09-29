// Question 1 : Example :Print the number of 7’s that are in the 2d array.
// Input - int[][] array = { {4,7,8},{8,8,7} };


public class arrayq1 {
// function to print no of 7's in a 2d array
public static int count(int matrix [][]){
int n = matrix.length;
int m = matrix[0].length;
int count =0;
for(int i =0;i<n;i++){
for(int j=0;j<m;j++){
if (matrix[i][j]==7) {
    count++;
}

}

}
return count;
}



    public static void main(String args[]){
int[][] array = { {4,7,8},{8,8,7} };
System.out.println(count(array));
    }
}
