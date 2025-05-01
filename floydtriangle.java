public class floydtriangle {
    public static void flyod_tri(int n){
        int counter=1;
        // printing rows
for (int i = 1; i<=n; i++) {
    // printing inner row elements
    for (int j = 1; j <=i; j++) {
        System.out.print(counter+" ");
        counter++;
    }
    System.out.println();
}


    }
public static void main(String args[]){

flyod_tri(5);


}


}
