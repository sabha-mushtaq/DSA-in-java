// hollow rectangle pattern
public class hollowrectangle {
    public static void hollow_rectangle(int rows,int cols){
//outer loop for total number of lines
for(int i=1;i<=rows;i++){
// for inner content
for (int j = 1; j<=cols; j++) {
    if (i==1||i==rows||j==1||j==cols) {
        System.out.print("*");
    }else{
System.out.print(" ");

    }
}
System.out.println();


}







    }
    public static void main(String args[]){

hollow_rectangle(5, 16);


    }
}
