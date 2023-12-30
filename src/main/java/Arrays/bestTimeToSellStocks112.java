package Arrays;

import java.util.Arrays;

public class bestTimeToSellStocks112 {
	
//	https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

	// Approach 1
	// iterate through the array, find the min value till "i" in the array and store in mins[]
	// iterate through the array, find the max value till "i" in the array and store in maxs[]
	// ans = min[i]-max[i]

	// public static int stockSell(int prices[]) {
	// 	int end=prices.length-1, ans=0;
	// 	int mins[]=new int[end+1];
	// 	int maxs[]=new int[end+1];
	// 	int min=Integer.MAX_VALUE;
	// 	int max=Integer.MIN_VALUE;
	// 	for(int i=0;i<end+1;i++){
	// 		min=Math.min(min,prices[i]);
	// 		mins[i]=min;
	// 	}
	// 	for(int i=end;i>=0;i--){
	// 		max=Math.max(max, prices[i]);
	// 		maxs[i]=max;
	// 	}
	// 	for(int i=0;i<=end;i++){
	// 		ans=Math.max(maxs[i]-mins[i],ans);
	// 	}
	// 	System.out.println(Arrays.toString(mins));
	// 	System.out.println(Arrays.toString(maxs));
	// 	return ans;
	// }

	// Approach 2 - OPTIMISED
	// iterate through prices
	// check min value in the array and parallely check the profit(current value - minimum value) in the array
	// ans=max value of profit
	public static int stockSell(int prices[]) {
		int end=prices.length-1, ans=0, min=Integer.MAX_VALUE;
		for(int i=0;i<end+1;i++){
			min=Math.min(min, prices[i]);
			ans=Math.max(ans, prices[i]-min);
		}
		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) {
		int arr[]={7,1,2,3,4,5};
		int k = stockSell(arr);
		System.out.println(k);
	}
}
