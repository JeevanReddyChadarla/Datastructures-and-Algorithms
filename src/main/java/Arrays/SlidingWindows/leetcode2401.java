package Arrays.SlidingWindows;

public class leetcode2401 {
	
	public static int longestNiceSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int i=0, j=1, end=nums.length-1, ans=1;
        int k = nums[0];
        while(j<=end){
        	k = nums[i]&nums[j];
            if(k==0) {
            	ans=Math.max(ans, j-i+1);
            }
            else {
            	k = k^nums[i];
            	i++;
            }
            j++;
        }
        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		int arr[]= {1,3,8,48,10};
		longestNiceSubarray(arr);
	}

}
