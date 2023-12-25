package Arrays;

public class bestTimeToSellStocks {
	
//	https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

	public static int stockSell(int prices[]) {
		int start=0, end=prices.length-1, profit=0, i=1;
		int buy=prices[0];
		int sell =prices[1];
		while(start<end) {
			if(buy<sell) {
				profit=sell-buy;
				
			}else {
				start++;
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
