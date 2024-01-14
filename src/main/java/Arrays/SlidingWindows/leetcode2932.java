package Arrays.SlidingWindows;

import java.util.Arrays;

public class leetcode2932 {
	
	public static int maximumStrongPairXor(int[] nums) {
        int ans=0, i=0, j=1, end=nums.length-1;
        Arrays.sort(nums);
        while(i<end && j<=end){
            if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                ans=Math.max(ans,nums[j]^nums[i]);
                j++;
            }
            else{
                i++;
            }
            j=j>end?i++:j;
        }
        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		int arr[]= {2,3,4,9,10};
		maximumStrongPairXor(arr);
	}

}
