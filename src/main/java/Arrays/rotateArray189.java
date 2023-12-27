package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class rotateArray189 {
//	Approach 1:
//		create a new array of double the size of given array say dum[]
//		fill dum with given array twice
//		copy the range ans=Arrays.copyOfRange(dup, arr.length-k, dup.length-k)
	
//	Approach 2:
//		given array arr[] of length n
//		need to rotate arr[] k-times
//		create a new array of size n, say, nums[] and fill it with arr[]
//		arr[(k+i)%n]=nums[i];
	
//	Approach 3:
//		reverse the given array
//		reverse elements from (0,k)
//		reverse elements from (k,end)

//	// Approach 2
//	public static int[] rotateArray(int arr[], int k) {
//		int nums[]=arr.clone();
//		int start=0, end=arr.length;
//		while(start<end) {
//			arr[(start+k)%end]=nums[start];
//			start++;
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}
	
	public static int[] rotateArray(int arr[], int k) {
		int start=0, end=arr.length-1;
		rotElementsInRange(arr, 0, arr.length);
		rotElementsInRange(arr, 0, k);
		rotElementsInRange(arr, k, arr.length);
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void rotElementsInRange(int arr[], int begin, int last) {
		int start=begin, end=last-1, temp=0;
		while(start<=end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
//		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		rotateArray(arr,3);
	}

}
