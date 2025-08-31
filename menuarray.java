public class menuarray {
public static int searchmenu(String arr [], String itemname){
for(int i =0;i<arr.length;i++){
if (arr[i].equals(itemname)) {
  return i;
}

}
return -1;

}



    public static void main (String  args[] ){
String menu[]={"apple","tea","samosa","biryani"};
int index = searchmenu(menu,"ea");
if (index ==-1) {
    System.out.println("item not found");
}else{
    System.out.println("item found at index :" + index);
}


}




    }

