package Arrays.PrefixSum;

public class maxSumSubArray {
	// kadane's algorithm - in readme 
	public static int maxSubArraySum(int arr[]) {
		int start=0, end=arr.length-1, sum=0, ans=Integer.MIN_VALUE;
		while(start<=end) {
			sum+=arr[start];
			ans=Math.max(sum, ans);
			sum=sum<0?0:sum;
			start++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {4,8,6,1,0,4,2,3};
		maxSubArraySum(arr);
	}

}
