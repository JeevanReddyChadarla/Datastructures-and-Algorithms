package Arrays.PrefixSum;

public class maxProductSubArray {
	// find prefix product and 
	// find suffix product and 
	// ans = max(pref,suff)
	public static int maxProductSubArray(int[] nums) {
        int start=0, end=nums.length-1, i=0, j=end, prod=1, ans=Integer.MIN_VALUE, pref=ans, suff=ans, product=1;
		while(start<=end) {
			prod*=nums[start];
			pref=Math.max(pref, prod);
			prod=prod<=0?1:prod;
			start++;
		}
		while(i<=j) {
			product*=nums[i];
			suff=Math.max(pref, product);
			product=product==0?1:product;
			i++;
		}
		ans=Math.max(pref, suff);
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {-3,-1,-1};//{3,-1,4};
		maxProductSubArray(arr);

	}

}
