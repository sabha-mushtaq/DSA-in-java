import java.util.*;
public class twod1 {
    // function to search a element 
public static boolean search(int matrix[][],int key){
for(int i =0;i<matrix.length;i++){
for(int j =0;j<matrix[0].length;j++){
if (matrix[i][j]==key) {
    System.out.print("found element at : " + "(" + i +  "," + j + ")");
    return true;
}


}
}

return false;



}
// function to find largest 
public static void  findlargest(int matrix [][]){
  
int largest = Integer.MIN_VALUE;  
for(int i=0;i<matrix.length;i++){

for(int j = 0;j<matrix[0].length;j++){
largest = Math.max(largest,matrix[i][j]);


}

}
System.out.println("max element  is " + largest );
}


    public static void main(String args[]){
        // creating a matrix
int matrix [][] = new int[3][3];
 int n = matrix.length;
 int m = matrix[0].length;
 Scanner sc = new Scanner(System.in);
 for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
matrix[i][j]= sc.nextInt();


}

 }
// printing a 2d matrix
 for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
System.out.print(matrix[i][j]+ " ");


}
System.out.println();
 }

search(matrix, 7);
System.out.println();
findlargest(matrix);
    }
}
