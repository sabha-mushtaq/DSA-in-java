import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {

    public static void main(String args[]){
ArrayList <String> cars = new ArrayList<String>();
cars.add("verna");
cars.add("nano");
cars.add("i10");
cars.add("mercedes");
for(int i =0;i<cars.size();i++){
// System.out.println(cars);
System.out.println(cars.get(i));
}

cars.set(2,"tyota");
System.out.println(cars.get(3));
for(int i =0;i<cars.size();i++){
// System.out.println(cars);
System.out.println(cars.get(i));
}

    }
}
