// printing solid rhombus

public class solidrhombus {
public static void solidrhombus(int n){
// for outer loop
for (int i = 1; i <=n; i++) {
    // for spaces
    for (int j = 1; j<=n-i;j++) {
        System.out.print(" ");
    }
    // for stars
    for (int k = 1; k <=n; k++) {
        System.out.print("*");
    }
    System.out.println();
}

}

    public static void main(String args[]){
solidrhombus(5);


    }
}
