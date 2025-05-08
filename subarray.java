public class subarray {
    public static void subarray(int numb[]){

for(int i=0;i<numb.length;i++){
int start=i;
for(int j =i;j<numb.length;j++){
    int end=j;
for(int k =start;k<=end;k++){
System.out.print(numb[k]+" ");

}
System.out.println();

}
System.out.println();
}


    }
    
    
    public static void main(String args[]){
 int numbers[]={1,2,3,4,5};

subarray(numbers);

    }
}
