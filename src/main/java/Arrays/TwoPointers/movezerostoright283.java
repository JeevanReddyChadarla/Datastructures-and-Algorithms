package Arrays.TwoPointers;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/

public class movezerostoright283 {
//	public static int[] moveZeros(int arr[]) {
//		int left=0, right=1, end=arr.length-1;
//		while(left<=right && right<=end) {
//			if(arr[left]!=0) {
//				left++;
//				right++;
//			}else if(arr[right]==0) {
//				right++;
//			}else {
//				int temp=arr[left];
//				arr[left]=arr[right];
//				arr[right]=temp;
//				left++;
//				right++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}
	
	//OPTIMIZED SOLUTION
	// traverse and check if the element is not 0
	// YES : i++ and fill the array
	// NO : fill the rest of elements with 0
	
	public static int[] moveZeros(int arr[]) {
		int start=0, end=arr.length-1, i=0;
		while(start<=end) {
			if(arr[start]!=0) {
				arr[i]=arr[start];
				i++;
			}
			start++;
		}
		while(i<=end) {
			arr[i]=0;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {4,2,4,0,0,3,0,5,1,0};//{1,3,12,0,0}
		moveZeros(arr);

	}

}
