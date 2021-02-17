package array;

/**
 * 买卖股票的最佳时机 II
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * @author xiongbiao
 * @date 2021/2/17 20:56
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int currentPrice = 0;
        int profit = 0;
        //交易标识 true表示当前可以买，false表示当前不能买，只能卖
        boolean canBuy = true;
        for (int i = 0; i < prices.length; i++) {
            if (canBuy && i < prices.length-1 && prices[i] < prices[i + 1]) {
                //买入
                currentPrice = prices[i];
                canBuy = false;
            }
            else if (!canBuy  && (i == prices.length-1 ||  (prices[i] > prices[i - 1] && prices[i] >= prices[i + 1]))) {
                //卖出
                profit += prices[i] - currentPrice;
                currentPrice = 0;
                canBuy = true;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{5,2,3,2,6,6,2,9,1,0,7,4,5,0}));
    }
}
