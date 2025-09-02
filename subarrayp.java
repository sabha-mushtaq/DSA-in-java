public class subarrayp {
    public static void subarray(int arr[]){

for(int i =0;i<arr.length;i++){
int curr =arr[i];
for(int j=i;j<arr.length;j++){

for(int k =i; k<j;k++){
 
System.out.print(arr[k] + "" );


}

System.out.println();

}
}

    }
    public static void main(String args []){
int numb[]={1,2,3,4,5};

subarray(numb);

    }
}
