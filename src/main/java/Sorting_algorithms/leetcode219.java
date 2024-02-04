package Sorting_algorithms;

public class leetcode219 {
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int j=0;
		for(int i=0;i<nums.length;i++){
        	for(j=Math.max(i-indexDiff, 0);j<i;j++) {
        		if(Math.abs(nums[j]-nums[i])<=valueDiff) {
        			return true;
        		}
        	}
        } 
        return false;   
    }

	public static void main(String[] args) {
		int arr[]= {1,5,9,1,5,9};
		int k=2;
		int p=3;
		System.out.println(containsNearbyAlmostDuplicate(arr, k, p));

	}

}
