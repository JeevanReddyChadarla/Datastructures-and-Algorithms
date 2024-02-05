package Hashing;

import java.util.HashSet;

public class leetcode128 {

	// Create a set and add all the elements to the set
	// while adding the elements to the set, find the minimum value in the array
	// in the inner while loop, initialize j=1, and check val+j is present in the set or not
	
	public static int longestConseq(int nums[]) {
		HashSet<Integer>set=new HashSet<Integer>();
		int minInArr=Integer.MAX_VALUE, j=1, ans=0, start=0;
		for(int i=0;i<nums.length;i++) {
			minInArr=Math.min(minInArr, nums[i]);
			set.add(nums[i]);
		}
		while(start<=nums.length-1) {
			int k=nums[start];
			j=1;
			while(set.contains(k+j)) {
				ans=Math.max(ans, j);
				j++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {

	}

}
