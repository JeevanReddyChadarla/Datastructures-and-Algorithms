package Arrays.TwoPointers;

public class singleElementInSortedArray540 {

//	https://leetcode.com/problems/single-element-in-a-sorted-array/description/
	//O(log n)
	// Binary search
	// go to mid element and 
	public static int returnSingle(int nums[]) {
		int start=0, end=nums.length-1, mid=(start+end)/2, ans=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(nums[mid]==nums[mid-1]|| nums[mid]==nums[mid+1]) {
				
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,2};//{1,1,2,3,3,4,4,8,8};//;
		int k = returnSingle(arr);
		System.out.println(k);
	}
}