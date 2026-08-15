package javalab.electricity;

import javalab.electricity.domestic.BillCalculator;

class domestic {
interface BillCalculator {
    public void calculateBill(String consumername,int consumerID, int unitsconsumed);
        
    }
    public class DomesticConsumer implements BillCalculator{
        public void calculateBill(String consumername,int consumerID, int unitsconsumed){
int bill = (unitsconsumed*6);
System.out.println("bill for " + consumername + "with id is " + bill);
        }
    }
    public class CommercialConsumer implements BillCalculator{
        public void calculateBill(String consumername,int consumerID, int unitsconsumed){
            int bill = (unitsconsumed*9);
            System.out.println("bill for " + consumername + "with id is " + bill);
        }
    }

}
