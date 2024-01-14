package Arrays.SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class leetcode2461 {
//			{1,5,4,2,9,9,9}
	    public static long maximumSubarraySum(int[] nums, int k) {
	            long sum=0, ans=0;
	            int i=0, j=0;
	            HashMap<Integer, Integer>map=new HashMap<>();
	            while(j<nums.length){
	                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
	                sum+=nums[j];
	                if(j-i+1==k){
	                    if(map.size()==k){
	                        ans=Math.max(ans,sum);
	                    }
	                    sum-=nums[i];
	                    map.put(nums[i], map.get(nums[i])-1);
	                    if(map.get(nums[i])==0){
	                        map.remove(nums[i]);
	                }
	                i++;
	                }
	                j++;
	            }
	            return ans;
	        }
	public static void main(String[] args) {
		int arr[]= {1,1,1,7,8,9};
		maximumSubarraySum(arr, 3);
	}

}
