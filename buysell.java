// best time to buy and sell stocks
public class buysell {
    public static int maxprofit(int prices[]) {
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyingprice) { 
                int profit = prices[i] - buyingprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyingprice = prices[i]; 
            }
        }

        return maxprofit; // 
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4,9};
        System.out.println(maxprofit(prices)); 
    }
}
