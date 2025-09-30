public class SubString {
public static String printsub(String name,int si,int ei){
String str = "";
for(int i =si;i<ei;i++){

str +=name.charAt(i);
}
return str;
}

    public static void main(String args[]){

String name = "sabhamushtaq";
System.out.println(printsub(name, 0, 3));
    }
}
