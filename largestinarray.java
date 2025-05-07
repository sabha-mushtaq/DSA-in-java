public class largestinarray {
    public static int findlargest(int numb[]){
int largest = Integer.MIN_VALUE;
for(int i =0;i<numb.length;i++){
if (largest<numb[i]) {
    largest=numb[i];
}

}
return largest;

    }

    public static int findsmallest(int numb[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<numb.length;i++){
        if (smallest>numb[i]) {
            smallest=numb[i];
        }
        
        }
        return smallest;
        
            } 
    public static void main(String args[]){

int numb[]={0,1,2,3,4,5};
int result = findsmallest(numb);
System.out.println("smallest number is : " + result);


    }
}
