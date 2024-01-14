package Arrays.SlidingWindows;

import java.util.Arrays;
import java.util.PriorityQueue;

public class leetcode2653 {
	public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int i=0, j=0,m=0,y=0;
		int count=nums.length-k+1;
		int arr[]=new int[count];
		int a[]=new int[k];
		int ar[]=new int[k];
        for(int p=0;p<nums.length;p++){
            nums[p]=nums[p]>0?0:nums[p];
        }
		while(j<nums.length) {
			ar[y]=nums[j];
			a=ar.clone();
			if(j-i+1==k) {
				arr[m]=kthSmallest(ar,k);
				m++;
				i++;
            }
			j++;
			y++;
            y=j%k==0?0:y;
		}
		return arr;
    }
    public static int kthSmallest(int[] arr, int K) {
        // Create a max heap (priority queue)
        int N = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
 
        // Iterate through the array elements
        for (int i = 0; i < N; i++) {
            // Push the current element onto the max heap
            pq.offer(arr[i]);
 
            // If the size of the max heap exceeds K, remove the largest element
            if (pq.size() > K)
                pq.poll();
        }
 
        // Return the Kth smallest element (top of the max heap)
        return pq.peek();
    }
	public static void main(String[] args) {
		int arr[]= {1,-1,-3,-2,3};
//		kthSmallest(arr, 2);
		getSubarrayBeauty(arr, 3, 2);
	}

}
