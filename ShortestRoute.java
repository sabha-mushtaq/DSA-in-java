public class ShortestRoute {
    // function to find shortest path
    public static float distance(String d){
int x=0;
int y =0;
d = d.toUpperCase();
for(int i=0;i<d.length();i++){
if (d.charAt(i)=='W') {
    x=x-1;
}else if(d.charAt(i)=='N'){
y=y+1;

}else if(d.charAt(i)=='S'){
    y=y-1;
}else{

    y=y-1;
}


}
int X1=x*x;
int Y1=y*y;
int distance = X1+Y1;
return (float)Math.sqrt(distance);

    }
    
    
    public static void main(String args[]){
String d = "sn";
System.out.println(distance(d));

    }
    
}
