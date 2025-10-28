public class checkoddevenbitwise {
    public static void check(int n){
int bitMask = 1;
if ((n & bitMask )== 0) {
    System.out.println("Number is even");
}else{
    System.out.println("Number is odd");
}


}
public static int getithbit(int n , int i){
int bitmask = 1<<i;
if ((n & bitmask) == 0) {
    return 0;
}else
  {  return 1;}


}
public static int setithbit(int n,int i){
int bitMask = 1<<i;
return n | bitMask;

}
public static int clearithbit(int n,int i){
int bitmask =~(1<<i);
return n & bitmask;

}
public static int updateithbit(int n,int i, int newBit){
if(newBit == 0){
    return clearithbit(n, i);
}else{

    return setithbit(n, i);
}

}
// another method to update
public static int updateithbit2(int n,int i,int newBit){
n = clearithbit(n,i);
int bitmask = newBit<<i;
return n | bitmask;

}
public static int clearithbits(int n, int i){

    int bitMask = (~0)<<i;
    return n & bitMask;


}
public static int clearbitsinrange(int n, int i,int j){
int a = ((~0)<<(j+1));
int b = (1<<i)-1;
int bitMask = a | b;
return n & bitMask;

}
public static boolean checkifpower(int n){
return (n &(n-1)) ==0;
}
public static int countsetbits(int n){
int count = 0;
while (n>0) {
   if ((n&1)!=0) {
    count++;
    
   }
   n=n>>1;
}

return count;
}

    public static void main(String args[]){
check(5);
// System.out.println(getithbit(4, 2));
// System.out.println(setithbit(2, 4));
// System.out.println(clearithbit(4, 2));
// System.out.println(updateithbit2(4, 2, 0));
// System.out.println(clearithbits(3, 2));
// System.out.println(clearbitsinrange(10, 2, 4));
// System.out.println(checkifpower(5));
System.out.println(countsetbits(17));
    }
}
