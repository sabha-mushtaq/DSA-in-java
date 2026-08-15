import javalab.electricity.*;
import javalab.electricity.domestic.CommercialConsumer;
import javalab.electricity.domestic.DomesticConsumer;

public class driver {
    public static void main(){
        DomesticConsumer  d1 =new DomesticConsumer();
        d1.calculateBill("sabha", 12345, 124);
        CommercialConsumer  c1= new CommercialConsumer();
        c1.calculateBill("hadiya", 67899, 206);
    }
}
