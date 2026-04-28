public class recursion {
public static int predec(int n){
if(n==1){
    return 1;
}
System.out.println(n);
  return predec(n-1);
}
public static int preinc(int n){
if(n==n){
    return n;
}
System.out.println(n);
return    n + predec(n-n-1);

}

    public static void main(String args[]){
        predec(10);

    }
}
