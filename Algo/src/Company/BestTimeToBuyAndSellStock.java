package Company;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        //Kadane's algorithm
        if(prices.length == 0) {
            return 0;
        }

        int max = 0;
        int min = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        return max;
    }



    public static int maxProfitYoutube(int[] prices) {
        //Kadane's algorithm

        int max_current = prices[0];
          int  mx_global = prices[0];


        if (prices.length == 0) {
            return 0;
        }


        for (int i = 1; i < prices.length; i++) {

            max_current = Math.max(prices[i], max_current + prices[i]);

            if (max_current > mx_global) {
                mx_global = max_current;
            }

        }
        return mx_global;
    }



    public static void main(String args []) {


        int [] a = {7, 1, 5, 3, 6, 4};

        BestTimeToBuyAndSellStock.maxProfitYoutube(a);


    }

}
