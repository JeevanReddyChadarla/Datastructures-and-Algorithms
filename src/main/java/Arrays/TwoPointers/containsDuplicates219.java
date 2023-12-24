package Arrays.TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicates219 {
	// https://leetcode.com/problems/contains-duplicate/
//	https://leetcode.com/problems/contains-duplicate-ii/
	public static boolean containsDuplicate(int[] nums, int k) {
		HashSet<Integer>set=new HashSet<Integer>();
        int start=0, end=nums.length-1, m=0;
        boolean b=false;
        while(start<=end) {
        	if(set.contains(nums[start])) {
        		m = findIndex(nums,start-1, nums[start]);
        		if(Math.abs(m-start)<=k) {
        			b=true; // Why debugger is not hitting here
        			break;
        		}
        	}
        	set.add(nums[start]);
        	start++;
        }
        return b;
    }
	public static int findIndex(int arr[], int end, int target) {
		for(int i=0;i<=end;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,0,1,1};
		containsDuplicate(arr,1);

	}

}
