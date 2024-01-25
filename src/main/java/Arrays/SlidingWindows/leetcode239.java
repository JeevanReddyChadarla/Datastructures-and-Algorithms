package Arrays.SlidingWindows;

import java.util.Arrays;

public class leetcode239 {
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
        int i=0, j=0, max=Integer.MIN_VALUE, y=0;
        int ans[]=new int[nums.length-k+1];
        while(j<nums.length && y<ans.length){
            max=Integer.MIN_VALUE;
            if(j-i+1==k){
                for(int z=i;z<=j;z++){
                    max=Math.max(max,nums[z]);
                }
                ans[y]=max;
                y++;
                i++;
            }
                j++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

	public static void main(String[] args) {
		int nums[]= {1};
		int k=1;
		maxSlidingWindow(nums, k);
	}

}
