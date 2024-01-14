package Arrays.SlidingWindows;

import java.util.Arrays;

public class lintcode883 {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int start=0, end=nums.length-1, sum=0, ans=0, count=0, j=0;
        while(start<=end) {
        	if(nums[start]==1) {
        		count++;
        	}else if(j%2==0){
        		j++;
        	}
        	count=j==0?count:count+1;
        	ans=Math.max(ans, count);
        	start++;
        }
        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		int arr[]= {1,0,1,1,0};
		findMaxConsecutiveOnes(arr);

	}

}
