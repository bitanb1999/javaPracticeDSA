package practiceDSA;

//medium
//valley peak approach
public class stockBuySell {
    public static int maxProfit(int[] prices, int size) {

        // maxProfit adds up the difference between
        // adjacent elements if they are in increasing order
        int profit = 0;
        int maxPr = Integer.MIN_VALUE;


        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < size; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
            if (profit > maxPr)
                maxPr = profit;
        }
        return maxPr;
    }

    // Driver code
    public static void main(String[] args) {

        // stock prices on consecutive days
        int[] price = {180, 40, 260, 310, 535, 695};
        //515 is expected
        int n = price.length;

        // function call
        System.out.println(maxProfit(price, n));
    }
}
