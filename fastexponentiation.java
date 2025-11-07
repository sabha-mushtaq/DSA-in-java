public class fastexponentiation {
    public static int fastexpo(int a, int b){
int result =1;
while (b >0) {
    if ((b &1)!=0) {
        result*=a;
    }
    a = a *a;
    b = b>>1;
}
return result;

    }
    public static void swap(int a,int b){
a = a^b;
b=a^b;
a=a^b;
System.out.println("After swapping :" + " " + a + " and  " + b);


    }
    public static void addone(int x){

x=-(~x);
System.out.println(x);

    }
    public static void main(String args[]){
System.out.println(fastexpo(2, 4));
System.out.println(5^3);
swap(4, 3);
addone(4);
    }
}
