public class pairsinarrayp {
public static void pairsinarray(int numb[]){
  int tp = 0; 
for(int i =0;i<numb.length;i++){
int curr = numb[i];

for(int j = i+1;j<numb.length;j++){
System.out.print("(" + curr + "," + numb[j] + ")" + " ");
tp++;
}
System.out.println();

}
System.out.println(tp);

}
public static void main (String args []){
int numbers [] = {1,2,3,4,5,6,7};
pairsinarray(numbers);

}




}