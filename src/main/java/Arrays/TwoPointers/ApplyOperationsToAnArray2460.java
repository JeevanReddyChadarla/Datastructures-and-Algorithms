package Arrays.TwoPointers;

import java.util.Arrays;

public class ApplyOperationsToAnArray2460 {
	
	public static int[] applyOperations(int[] nums) {
		int start=0, end=nums.length-1, left=0, right=1, i=0;
		while(right<=end) {
			if(nums[left]==nums[right]) {
				nums[left]=2*nums[left];
				nums[right]=0;
			}
			else {
				nums[left]=nums[left];
				nums[right]=nums[right];
			}
				left++;
				right++;
		}
//		System.out.println(Arrays.toString(nums));
		
		while(start<=end) {
			if(nums[start]!=0) {
				nums[i]=nums[start];
				i++;
			}
			start++;
		}
		while(i<=end) {
			nums[i]=0;
			i++;
		}
		
        System.out.println(Arrays.toString(nums));
		return nums;
    }

	public static void main(String[] args) {
		int arr[]= {3,0,0,7};
		applyOperations(arr);
	}

}
