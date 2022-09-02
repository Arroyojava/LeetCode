/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a
    different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

package leetCode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] p = {7, 1, 5, 3, 6, 4};
        int[] q = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(p));
        System.out.println(maxProfit(q));
        System.out.println(maxP(q));
        System.out.println(maxP(p));

    }

    public static int maxProfit(int[] prices) {
        int left = 0; //Buy
        int right = 1; //Sell

        int maxP = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            } else
                left = right;
            right++;
        }
        return maxP;

    }

    public static int maxP(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int val : prices) {
            min = Math.min(min, val);
            ans = Math.max(ans, val - min);
        }
        return ans;
    }
}

