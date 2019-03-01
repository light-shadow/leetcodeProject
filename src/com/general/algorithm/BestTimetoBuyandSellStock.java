package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 121. Best Time to Buy and Sell Stock
 * status: pass
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] pprice1 = {7,1,5,3,6,4};
        int[] pprice2 = {7,6,4,3,1};
        System.out.println(maxProfit(pprice1));
        System.out.println(maxProfit(pprice2));

    }

    public static int maxProfit(int[] prices) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            int current = prices[i];
            for(int j=i+1;j<prices.length;j++){
                int next = prices[j];
                if(next - current >0){
                    list.add(next-current);
                }
            }
        }
        if(list.size() == 0){
            return 0;
        }
        return Collections.max(list);
    }
}