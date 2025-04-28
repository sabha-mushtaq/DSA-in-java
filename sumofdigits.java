public class sumofdigits {
    static void adddigit(int n){
int sum = 0;
int originalnumb = n;
while (n>0) {
    int nd=n%10;
    n=n/10;
    sum+=nd;
}

System.out.println(sum);

    }
    public static void main(String args[]){

adddigit(523);




    }
}
