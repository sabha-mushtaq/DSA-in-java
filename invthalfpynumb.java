// There is a more robust and better approach  for this logic 
public class invthalfpynumb {
    public static void invertpynumb(int rows,int cols){
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j<=cols; j++) {
        System.out.print(j);
        
    }
    cols--;
    System.out.println();
}





    }
    public static void main(String args[]){

invertpynumb(15, 15);



    }
}
