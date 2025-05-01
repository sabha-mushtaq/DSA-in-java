// inverted and rotated half-pyramid
public class invhalpyra {
public static void invertedhalfpyramid(int rows,int cols){

for (int i = 1; i <=rows ; i++) {
    for (int j = 1; j <=rows-i ; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <=i; k++) {
        System.out.print("*");
    }
    System.out.println();
}



}
    public static void main(String args[]){

invertedhalfpyramid(5, 6);


    }
}