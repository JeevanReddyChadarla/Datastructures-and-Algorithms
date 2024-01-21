package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement503 {
	// https://leetcode.com/problems/next-greater-element-ii/description/
	// public static int[]  nextGreaterElements(int[] nums) {
	// 	int s=0, start=0, end=2*nums.length-1, x=nums.length-1, k=nums[0], m=0;
	// 	int rep[]=new int[2*nums.length];
	// 	for(int i=0;i<2*nums.length;i++) {
	// 		rep[i]=nums[s];
	// 		s++;
	// 		s=s==nums.length?0:s;
	// 	}
	// 	while(start<=end && m<=x) {
	// 		if(rep[start]>k) {
	// 			nums[m]=rep[start];
	// 			m++;
	// 			start=m;
	// 			k=rep[start];
	// 		}
	// 		else {
	// 			start++;
	// 			if(start==end) {
	// 				nums[m]=-1;
	// 				m++;
	// 				start=m;
	// 				k=rep[start];
	// 			}
	// 		}
	// 	}
		
	// 	System.out.println(Arrays.toString(rep));
	// 	System.out.println(Arrays.toString(nums));
	// 	return nums;
	// }

	// OPTIMIZED APPROACH - 
	public static int[]  nextGreaterElements(int[] nums) {
		int ans[]=new int[nums.length];
        int x=0;
		Stack<Integer>stack=new Stack<>();
		for(int i=(2*nums.length)-1;i>=0;i--) {
            x=i%nums.length;
            while(!stack.isEmpty() && stack.peek()<=nums[x]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[x]=-1;
            }else{
                ans[x]=stack.peek();
            }
            stack.push(nums[x]);
        }
		System.out.println(Arrays.toString(ans));
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,1}; // 2},3,4,-1,4
		nextGreaterElements(arr);
	}

}
